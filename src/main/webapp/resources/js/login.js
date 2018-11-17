/*Funktion um das DOM so zu manipulieren, sodass Felder wie die Passworteingabe beim Klicken auf "Passwort vergessen?" verschwinden*/
function forgottenPassword(){
    document.getElementById("username").style.display = "none";
    document.getElementById("password").style.display = "none";
    document.getElementById("btn").style.display = "none";
    document.getElementById("register").style.display = "none";
    document.getElementById("forgot").style.display = "none";
    document.getElementById("passwordForgottenForm").style.display = "block";
    document.getElementById("error").remove();
}

/*Funktion um das DOM so zu manipulieren, sodass Felder wie die Passworteingabe beim Klicken auf "Zurück" wieder angezeigt werden*/
function loginBack(){
    document.getElementById("username").style.display = "block";
    document.getElementById("password").style.display = "block";
    document.getElementById("btn").style.display = "block";
    document.getElementById("register").style.display = "block";
    document.getElementById("forgot").style.display = "block";
    document.getElementById("passwordForgottenForm").style.display = "none";
}