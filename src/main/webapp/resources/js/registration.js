function validateRegistrationForm() {
    let passwordV = document.forms["RegistrationForm"]["password"].value;
    let passwordREV = document.forms["RegistrationForm"]["passwordRE"].value;

    if (passwordV !== passwordREV) {
        document.getElementById("error").innerHTML = "Passwörter stimmen nicht überein";

        return false;
    }
}

