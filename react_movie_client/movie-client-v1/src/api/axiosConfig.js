import axios from 'axios';


export default axoios.create(
    {
        baseURL: 'https://9c96-103-106-239-104.ap.ngrok.io',
        headers: {"ngrok-skip-browser-warning": "true"}
        // This header is needed because there are problems 
        // in development face of cors cross-origin-resource-sharing
    }
);