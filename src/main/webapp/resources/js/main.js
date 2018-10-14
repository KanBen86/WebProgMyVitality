var loginButton = document.getElementsByClassName("login");
var text = document.getSelection("h1");

function changeText(id) {
    window.location.assign("/login");
}

function mouseoverLogin(element){
    element.innerHTML = "<u>Login</u>";
}

function mouseleaveLogin(element){
    element.innerHTML = "Login";
}