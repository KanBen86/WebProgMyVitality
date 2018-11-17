/* Funktion um die Übereinstimmung wiederholt eingegebener Werte zu prüfen */
function validateRegistrationForm() {
    let passwordV = document.forms["RegistrationForm"]["password"].value;
    let passwordREV = document.forms["RegistrationForm"]["passwordRE"].value;
    let emailV = document.forms["RegistrationForm"]["email"].value;
    let emailREV = document.forms["RegistrationForm"]["emailRE"].value;

    /* Passwort prüfen */
    if (passwordV !== passwordREV) {
        document.getElementById("error").innerHTML = "Passwörter stimmen nicht überein";

        return false;
    }

    /* E-Mail prüfen */
    if (emailV !== emailREV) {
        document.getElementById("error").innerHTML = "E-Mailadressen stimmen nicht überein";

        return false;
    }
}

