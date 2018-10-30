/**
 * JS Datei für Browserseitige Logik
 * @author Tamino Fischer alias CodeKeks
 * */


/**
 * Durch diese Methode wird das Kreisdiagramm zuammengebaut,
 * die dafür benötigten Daten werden aus der HTML Tabelle ausgelesen
 * Für die visualisierung wird der google Pie Chart verwendet
 */

//google chats laden und Methode drawChart aufrufen
google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);

//In dieser Methode werden die benötigten Daten aggregiert und an den chartBuilder übergeben
function drawChart() {
    // Es wird eine leeres Array angelegt und mit den Zelleninhalten der Tabelle befüllt
    let tableContentList= [];
    var table = document.getElementById("table");
    for (var i = 1, row; row = table.rows[i]; i++) {
        for (var j = 0, col; col = row.cells[j]; j++) {
            tableContentList.push(col.innerHTML.toString());
        }
    }
    //Für den chartBuilder sind  ist nur die Bezeichnung und die Menge relevant,
    //deshalb werden die überflüssigen Informationen zur Einnahme gelöscht.
    //Das Ergebnis wird dannin Form von Arrays in einem Array gespeichert.
    //(Wird von der Methode addRows so verlangt)
    let descriptionQuantityList = [];
    for (var i = 0; i < tableContentList.length; i++) {
        if((i % 3) == 0){
            let t = [tableContentList[i], parseFloat(tableContentList[i+1]) ];
            descriptionQuantityList.push(t);
        }
    }

    //Die aggregierten Daten werden nun den chartBuilder übergeben
    var data = google.visualization.arrayToDataTable([
        ['Task', 'Percentages'],
        descriptionQuantityList[0]
    ]);
    data.addRows(0);
    data.addRows(descriptionQuantityList);

    // Optionen für den Pie Chart
    var options = {backgroundColor: 'transparent','title':'Deine Zusammensetzung', 'width':'auto', 'height':'auto'};

    // Anzeige des Pie Charts
    var chart = new google.visualization.PieChart(document.getElementById('piechart'));
    chart.draw(data, options);
}

/**
 * Wenn die Funktion aufgerufen wird soll folgende passieren:
 *      -Alter HTML table löschen
 *      -Rest API callen und aktuellen Datensatz holen
 *      -Mit JS neuen Table erstellen und befüllen
 */

function refreshTable(){
    //Alten table löschen
    let oldTable = document.getElementById("table");
    oldTable.remove();

    //CustomerId speichern
    let customerId = document.getElementById("customerId").innerText;

    //Synchroner REST API call
    let socket = 'localhost:8080';
    var request = new XMLHttpRequest();
    request.open('GET', 'http://' + socket + '/supplementconfiguration/' + customerId, false);  //
    request.send(null);
    if (request.status === 200) {
        //Response in Variablen speichern
        suplementConfiguration = JSON.parse(request.responseText);
        articleList = suplementConfiguration.articleList;
        quantityList = suplementConfiguration.quantitList;
        informationList = suplementConfiguration.informationList;
    }

    //Neuen Table bauen
    //Table Gerüst bauen und in das DIV TableArea einfügen
    var table = document.createElement("TABLE");
    table.setAttribute("id", "table");
    document.getElementById("tableArea").appendChild(table);

    //Neue TableRow erstellen + befüllen und in den tabke einfügen
    var tableRow = document.createElement("TR");
    tableRow.setAttribute("id", "tableRow");
    document.getElementById("table").appendChild(tableRow);
    //Ersten TableHead erstellen und einfügen
    var tableHead1 = document.createElement("TH");
    var tableText1 = document.createTextNode("Artikel");
    tableHead1.appendChild(tableText1);
    document.getElementById("tableRow").appendChild(tableHead1);
    //Zweiten Tableheaderstellen und einfügen
    var tableHead2 = document.createElement("TH");
    var tableText2 = document.createTextNode("Dosierung");
    tableHead2.appendChild(tableText2);
    document.getElementById("tableRow").appendChild(tableHead2);
    //Dritten Tablehead erstellen und einfügen
    var tableHead3 = document.createElement("TH");
    var tableText3 = document.createTextNode("Info");
    tableHead3.appendChild(tableText3);
    document.getElementById("tableRow").appendChild(tableHead3);

    //Erstellen der Inhalte durch Iteration
    for(let i = 0; i<articleList.length; i++){
        var table = document.getElementById("table");
        var row = table.insertRow(-1);
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        var cell3 = row.insertCell(2);
        cell1.innerHTML = articleList[i].description;
        cell2.innerHTML = quantityList[i];
        cell3.innerHTML = informationList[i];
    }
}

