
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

