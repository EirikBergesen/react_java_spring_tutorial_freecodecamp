import './App.css';
import api from './api/axiosConfig';
import { useEffect, useState } from 'react';
import Layout from './components/Layout';
import { Routes, Route } from 'react-router-dom'
import Home from './components/home/Home';
import Header from './components/header/Header';
import Trailer from './components/trailer/Trailer';

function App() {

  const [movies, setMovies] = useState();

  const getMovies = async () => {
    try {
      const response = await api.get("/api/v1/movies");
      setMovies(response.data);
    } catch (error) {
      console.log(error)
    }

  }

  // This runs when the component first loads
  useEffect(() => {
    getMovies();
  }, [])

  // The site would throw an exception if the movies are not loaded yet
  // So we need to check if the movies are loaded before rendering the page
  // Homemade solution to the problem, hopefully better solutions exist
  if (!movies) {
    return <div>Loading...</div>
  }
  return (
    <div className="App">
      <Header/>
      <Routes>
        <Route path="/" element={<Layout/>}>
            <Route path="/" element={<Home movies={movies}/>} />
            <Route path="/Trailer/:ytTrailerId" element={<Trailer/>}></Route>
        </Route>
      </Routes>
    
    </div>
  );
}

export default App;
