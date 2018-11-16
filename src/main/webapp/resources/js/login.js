function forgottenPassword(){
    document.getElementById("username").style.display = "none";
    document.getElementById("password").style.display = "none";
    document.getElementById("btn").style.display = "none";
    document.getElementById("register").style.display = "none";
    document.getElementById("forgot").style.display = "none";
    document.getElementById("passwordForgottenForm").style.display = "block";
    /*Folgender Teil funktioniert noch nicht: */
    document.getElementById("error").value = "";
}

function loginBack() {
    document.getElementById("username").style.display = "block";
    document.getElementById("password").style.display = "block";
    document.getElementById("btn").style.display = "block";
    document.getElementById("register").style.display = "block";
    document.getElementById("forgot").style.display = "block";
    document.getElementById("passwordForgottenForm").style.display = "none";
}

/*
function sendMail(){
    document.getElementById("error").innerHTML = "E-Mail wird versendet...";
    window.document.location.href = "/login";
}
*/