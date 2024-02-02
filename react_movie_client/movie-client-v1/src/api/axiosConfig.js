import axios from 'axios';


export default axios.create(
    {
        baseURL: 'http://localhost:8080',
        headers: {
            // "ngrok-skip-browser-warning": "true"
        }
        /* 
        This header is needed because there are problems 
        in development face of cors cross-origin-resource-sharing
        */
        // above was not necessary as i had change the controller on the backend
        // See the controller in the backend for more info or readme file
    }
);