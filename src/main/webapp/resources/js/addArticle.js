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

    // öffnen des Socket für den POST
    request.open('POST', socket + '/Artikel', false);

    // definieren, dass es sich um ein JSON im Body handelt
    request.setRequestHeader('Content-Type', 'application/json');

    // hier wird der JSON-Datensatz in den Body der POST-URI übergeben
    request.send('{"articleId":"'+ articleId.value +
        '","description":"' + description.value +
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
}