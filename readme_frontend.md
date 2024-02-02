
# Building a Client


### Install node.js

install node.js

### Initializing the react project

In the terminal, navigate to the frontend folder and run the following command:

npm create-react-app name-of-app
npm will create a new react project in the folder name-of-app


For this project we can delete the following files:
* App.test.js
* reportWebVitals.js
* setupTests.js

in the file; package.json, delete the settings for:
* eslintConfig

in the file index.js, delete the following lines:
* reportWebVitals();
* import reportWebVitals from './reportWebVitals';


### Installing packages

npm install axios
* Axios - makes it easier to make http requests from our react client, so we can retrieve information from our api, and POST information to our api.

npm install bootstrap


for layout and styling purposes:
npm install react-bootstrap


for font awesome icons:
npm i @fortawesome/react-fontawesome


second font awesome package: 
npm i @fortawesome/free-solid-svg-icons


to play movie trailers in the app:
react player component:
npm i react-player


in order to decleare the paths where our components will reside, in order to map the routes to our components, we are going to use relevant components from the react-router-dom npm package:
npm i react-router-dom


we want to display movies on a carousel.
we can implement a carousel using material UI.
We will install 3 material ui npm packages

* npm install @mui/material @emotion/react @emotion/styled
* npm install react-material-ui-carousel


### Axios - API requests

/api/axiosConfig.js

creates a base url for the axios requests

Cross-Origin-Resource-Sharing (CORS) is a security feature implemented in web browsers to prevent JavaScript from making requests to a different domain than the one that served the JavaScript. This is a security feature to prevent cross-site scripting attacks.


I found this site, looking like my problem
https://rajendraprasadpadma.medium.com/what-the-cors-ft-spring-boot-spring-security-562f24d705c9

put @CrossOrigin(origins = "http://localhost:3000") on the controller class, and it worked.