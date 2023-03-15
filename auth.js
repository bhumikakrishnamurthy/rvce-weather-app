function authenticateUser() {
  var email = document.getElementById("email").value;
  var password = document.getElementById("password").value;

  // Check if username and password match hardcoded values
  if (email === "myusername@gmail.com" && password === "mypassword") {
    // Redirect user to dashboard page
    window.location.href = "dashboard.html";
  } else {
    // Show error message
    document.getElementById("error-message").innerHTML = "Invalid email or password";
  }
}
