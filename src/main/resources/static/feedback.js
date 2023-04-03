const form = document.getElementById('feedback-form');

form.addEventListener('submit', (event) => {
  event.preventDefault();
  window.location.href = 'login.html';
});
