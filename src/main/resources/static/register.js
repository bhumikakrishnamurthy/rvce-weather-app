
const registrationForm = document.getElementById('registration-form');
const loginButton = document.createElement('button');

loginButton.textContent = 'Already registered? Click here to login.';
loginButton.addEventListener('click', () => {
  window.location.href = 'login.html';
});

registrationForm.appendChild(loginButton);

function 
