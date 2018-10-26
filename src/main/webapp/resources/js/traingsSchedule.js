function addTrainingsschedule() {

    let sets = document.getElementById("sets");

    let b = document.getElementById("btn-add-ts");

    b.innerText = sets.value;

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
        '            "exerciseNo": 1,\n' +
        '            "exerciseDesc": "test",\n' +
        '            "sets": '+ sets.value + ',\n' +
        '            "reps": 20,\n' +
        '            "breakSec": 90,\n' +
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