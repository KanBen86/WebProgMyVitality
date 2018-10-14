function addArticleClicked(element){
    element.parentElement.style.display = "none";
    var addArticle = ducument.getElementById("addArticle");
    addArticle.style.display = "block";
}

function showStorrageClicked(element) {
    element.parentElement.style.display = "none";
    document.getElementById("showStorrage").style.display = "block";
}

function saveClicked(element) {
    element.parentElement.style.display = "none";
    document.getElementById("warehouseMain").style.display = "block";
}