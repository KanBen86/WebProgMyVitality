function addTrainingsschedule() {

    let username = document.getElementById("username").value;
    let exerciseNo = document.getElementById("exerciseNo").value;
    let exerciseDesc = document.getElementById("exerciseDesc").value;
    let sets = document.getElementById("sets").value;
    let reps = document.getElementById("reps").value;
    let breakSec = document.getElementById("breakSec").value;

    let socket = 'http://localhost:8080';
    let request = new XMLHttpRequest();

    // öffnen des Socket für den POST
    request.open('POST', socket + '/saveSchedule/'+ username, false);

    // definieren, dass es sich um ein JSON im Body handelt
    request.setRequestHeader('Content-Type', 'application/json');

    // hier wird der JSON-Datensatz in den Body der POST-URI übergeben
    request.send('{"scheduleId": null,"exerciseNo": '+exerciseNo+',"exerciseDesc": "'+exerciseDesc+'","sets": '+sets+',"reps": '+reps+',"breakSec": '+breakSec+',"fitnessLevel": null,"heartFrequency": [1,2,3],"customer": null}');
}