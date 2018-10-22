function validateForm() {
    var passwordV = document.forms["RegistrationForm"]["password"].value;
    var passwordREV = document.forms["RegistrationForm"]["passwordRE"].value;

    if (passwordV != passwordREV) {
        alert("Passwörter stimmen nicht überein");
        document.getElementById("error").innerHTML = "Passwörter stimmen nicht überein";
        return false;
    }

}

