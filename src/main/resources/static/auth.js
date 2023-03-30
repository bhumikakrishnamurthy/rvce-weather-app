function authenticateUser() {
  const email = document.getElementById("email").value;
  const password = document.getElementById("password").value;
  const loginUrl = "http://localhost:8080/login";
  const loginData = { email: email, password: password };
  const loginRequestOptions = {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(loginData),
  };
  fetch(loginUrl, loginRequestOptions)
      .then(response => response.text())
      .then(status => {
          if (status === false) {
              const errorMessage = document.getElementById("error-message");
              errorMessage.innerHTML = error.message;
          } else {
              window.location.href = "/dashboard.html";
          }
      })
      .catch((error) => {
        const errorMessage = document.getElementById("error-message");
        errorMessage.innerHTML = error.message;
      });
}
