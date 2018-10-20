/**
 * Wenn die Funktion aufgerufen wird soll folgende passieren:
 *      -Alter HTML table löschen
 *      -Rest API callen und aktuellen Datensatz holen
 *      -Mit JS neuen Table erstellen und befüllen
 */

function refreshTable(){
    /**
     * Alten Table löschen
     * @type {HTMLElement}
     */
    let oldTable = document.getElementById("table");
    oldTable.remove();





    /**
     * Synchroner REST call
     * @type {XMLHttpRequest}
     */
    let socket = 'localhost:8080';
    var request = new XMLHttpRequest();
    request.open('GET', 'http://' + socket + '/supplementconfiguration/11111', false);  //
    request.send(null);

    if (request.status === 200) {
        let btn = document.getElementById("aktualisieren");
        articleArray = JSON.parse(request.responseText);
        btn.innerText = articleArray[0].articleId;
    }


    /**
     * Neuen Table bauen
     * @type {HTMLElement}
     */
        //Table Gerüst bauen und in das DIV TableArea einfügen
    var table = document.createElement("TABLE");
    table.setAttribute("id", "table");
    document.getElementById("tableArea").appendChild(table);

    //Neue TableRow erstellen + befüllen und in den tabke einfügen
    var tableRow = document.createElement("TR");
    tableRow.setAttribute("id", "tableRow");
    document.getElementById("table").appendChild(tableRow);

    var tableHead1 = document.createElement("TH");
    var tableText1 = document.createTextNode("Id");
    tableHead1.appendChild(tableText1);
    document.getElementById("tableRow").appendChild(tableHead1);

    var tableHead2 = document.createElement("TH");
    var tableText2 = document.createTextNode("Beschreibung");
    tableHead2.appendChild(tableText2);
    document.getElementById("tableRow").appendChild(tableHead2);

    var tableHead3 = document.createElement("TH");
    var tableText3 = document.createTextNode("Preis");
    tableHead3.appendChild(tableText3);
    document.getElementById("tableRow").appendChild(tableHead3);


    //Erstellen der Inhalte
    for(let i = 0; i<articleArray.length; i++){
        var table = document.getElementById("table");
        var row = table.insertRow(-1);
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        var cell3 = row.insertCell(2);
        cell1.innerHTML = articleArray[i].articleId;
        cell2.innerHTML = articleArray[i].description;
        cell3.innerHTML = articleArray[i].price;

    }
}

