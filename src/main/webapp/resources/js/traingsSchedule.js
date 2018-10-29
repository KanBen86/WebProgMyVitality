function addTrainingsschedule() {

    let benutzername = document.getElementById("benutzername");
    let uebungsnummer = document.getElementById("uebungsnummer");
    let uebungsname = document.getElementById("uebungsname");
    let satzzahl = document.getElementById("satzzahl");
    let wiederholung = document.getElementById("wiederholung");
    let pausenzeit = document.getElementById("pausenzeit");
    let informationen = document.getElementById("informationen");

    let username = document.getElementById("username").value;
    let exerciseNo = document.getElementById("exerciseNo").value;
    let exerciseDesc = document.getElementById("exerciseDesc").value;
    let sets = document.getElementById("sets").value;
    let reps = document.getElementById("reps").value;
    let breakSec = document.getElementById("breakSec").value;
    let info = document.getElementById("info").value;

    benutzername.innerHTML = username;
    uebungsnummer.innerHTML = exerciseNo;
    uebungsname.innerHTML = exerciseDesc;
    satzzahl.innerHTML = sets;
    wiederholung.innerHTML = reps;
    pausenzeit.innerHTML = breakSec;
    informationen.innerHTML = info;

    let socket = 'http://localhost:8080';
    let request = new XMLHttpRequest();

    // öffnen des Socket für den POST
    request.open('POST', socket + '/customer', false);

    // definieren, dass es sich um ein JSON im Body handelt
    request.setRequestHeader('Content-Type', 'application/json');

    // hier wird der JSON-Datensatz in den Body der POST-URI übergeben
    request.send(
        '{\n' +
        '    "firstname": null,\n' +
        '    "lastname": null,\n' +
        '    "adress": null,\n' +
        '    "dateOfBirth": null,\n' +
        '    "emailAddress": null,\n' +
        '    "username": "StaplerfahrerKlaus",\n' +
        '    "password": "123",\n' +
        '    "phoneNo": null,\n' +
        '    "sex": null,\n' +
        '    "accounts": [],\n' +
        '    "customerId": "11111",\n' +
        '    "billAdress": null,\n' +
        '    "goal": null,\n' +
        '    "trainingSchedules": [\n' +
        '        {\n' +
        '            "scheduleId": "6992562a-0a40-4955-a9e5-a714af7f6fa0",\n' +
        '            "exerciseNo": '+ exerciseNo.value + ',\n' +
        '            "exerciseDesc": '+ exerciseDesc.value +',\n' +
        '            "sets": '+ sets.value + ',\n' +
        '            "reps": '+ reps.value + ',\n' +
        '            "breakSec": '+ breakSec.value + ',\n' +
        '            "fitnessLevel": null,\n' +
        '            "heartFrequency": [\n' +
        '                -120\n' +
        '            ]\n' +
        '        },\n' +
        '        {\n' +
        '            "scheduleId": "30cf1a01-6a64-4a05-aeeb-207d65fec557",\n' +
        '            "exerciseNo": 1,\n' +
        '            "exerciseDesc": "Hyperxtension",\n' +
        '            "sets": 3,\n' +
        '            "reps": 20,\n' +
        '            "breakSec": 90,\n' +
        '            "fitnessLevel": null,\n' +
        '            "heartFrequency": [\n' +
        '                -120\n' +
        '            ]\n' +
        '        },\n' +
        '        {\n' +
        '            "scheduleId": "d63af211-7b63-450b-9c5d-85e010238d9f",\n' +
        '            "exerciseNo": 1,\n' +
        '            "exerciseDesc": "BiCurl",\n' +
        '            "sets": 3,\n' +
        '            "reps": 20,\n' +
        '            "breakSec": 90,\n' +
        '            "fitnessLevel": null,\n' +
        '            "heartFrequency": [\n' +
        '                -120\n' +
        '            ]\n' +
        '        }\n' +
        '    ],\n' +
        '    "fitnessLevel": null,\n' +
        '    "preferredTypeOfPayment": "Banküberweisung",\n' +
        '    "delivieryAddress": null\n' +
        '}'


    );
}