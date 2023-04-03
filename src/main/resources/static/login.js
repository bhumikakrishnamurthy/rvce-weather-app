const loginForm = document.querySelector('#login-form');

loginForm.addEventListener('submit', (event) => {
  event.preventDefault();

  // perform login authentication here

  // redirect to home page
  window.location.href = 'index.html';
});
