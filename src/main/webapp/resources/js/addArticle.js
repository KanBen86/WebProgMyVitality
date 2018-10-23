function addArticle() {

    let description = document.getElementById("bezeichung");
    let barcode = document.getElementById("barcode");
    alert("Id des Elements: " + description.id + "; Inhalt des Elements: " + description.value);
    let socket = 'http://localhost:8080';
    let request = new XMLHttpRequest();

    // öffnen des Socket für den POST
    request.open('POST', socket + '/Artikel', false);

    // definieren, dass es sich um ein JSON im Body handelt
    request.setRequestHeader('Content-Type', 'application/json');

    // hier wird der JSON-Datensatz in den Body der POST-URI übergeben
    request.send('{"articleId":null,"description":"' + description.value +
        '","ingredients":null,"barcode":'+barcode.value+',"price":1.0,"supplier":null,"allergens":null}');
}