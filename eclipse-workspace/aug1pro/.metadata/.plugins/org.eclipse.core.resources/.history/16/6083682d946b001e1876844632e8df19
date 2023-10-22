 const registrationForm = document.getElementById('registrationForm');
const loginForm = document.getElementById('loginForm');

registrationForm.addEventListener('submit', function (event) {
    event.preventDefault();
    const username = registrationForm.querySelector('#username').value;
    const password = registrationForm.querySelector('#password').value;
    // You can perform registration actions here (e.g., sending data to a server).
    console.log(`Registered: Username - ${username}, Password - ${password}`);
    registrationForm.reset();
});

loginForm.addEventListener('submit', function (event) {
    event.preventDefault();
    const loginUsername = loginForm.querySelector('#loginUsername').value;
    const loginPassword = loginForm.querySelector('#loginPassword').value;
    // You can perform login actions here (e.g., authentication).
    console.log(`Logged in: Username - ${loginUsername}, Password - ${loginPassword}`);
    loginForm.reset();
});
