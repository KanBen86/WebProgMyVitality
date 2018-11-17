function addArticle() {
    let articleId = document.getElementById("articleId");
    let description = document.getElementById("bezeichnung");
    let information = document.getElementById("information")
    let ingredients = document.getElementById("ingredients");
    let barcode = document.getElementById("barcode");
    let price = document.getElementById("preis");
    let rackSector = document.getElementById("rackSector");
    let rackCorridor = document.getElementById("rackCorridor");
    let level = document.getElementById("level");
    let amount = document.getElementById("amount");

    let socket = 'http://localhost:8080';
    let request = new XMLHttpRequest();

    window.location.assign("http://localhost:8080/warehouse");

    // Zurück zur Inhaltsübersicht des Lagers wenn der Request den richtigen Wert liefert
    request.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            alert("readyState 4 und status 200");
            document.getElementById("success").hidden=false;
        }
    };
    // öffnen des Socket für den POST
    // definieren, dass es sich um ein JSON im Body handelt
    // hier wird der JSON-Datensatz in den Body des Request geschrieben. Wichtig ist die
    // richtige Struktur

    request.open('POST', socket + '/saveArtikel/' + articleId.innerText, false);

    request.setRequestHeader('Content-Type', 'application/json');

    request.send('{"articleId":null' +
        ',"description":"' + description.value +
        '","information":"' + information.value +
        '","ingredients":"'+ ingredients.value +
        '","barcode":'+ barcode.value+
        ',"price":'+ price.value +
        ',"supplier":null'+
        ',"allergens":null'+
        ',"storrage":{'+
        '"rackSector":"'+ rackSector.value +
        '","rackcorridor":"' + rackCorridor.value +
        '","level":'+ level.value +
        ',"amount":'+ amount.value +'}}');
    request.abort();


}
