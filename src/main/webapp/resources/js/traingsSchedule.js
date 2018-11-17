function addTrainingsschedule() {

    //Variablendeklaration
    let username = document.getElementById("username");
    let exerciseNo = document.getElementById("exerciseNo");
    let exerciseDesc = document.getElementById("exerciseDesc");
    let sets = document.getElementById("sets");
    let reps = document.getElementById("reps");
    let breakSec = document.getElementById("breakSec");

    function checkIfNumeric(s) {
        let uebNumPattern = /[0-9]/g;
        if (!uebNumPattern.test(s.value)) {
            s.classList.add('w3-text-red');
            alert(s.id + " ist keine Nummer:" + s.value);
        }
    }

    checkIfNumeric(exerciseNo);
    checkIfNumeric(sets);
    checkIfNumeric(reps);
    checkIfNumeric(breakSec);

    // Pfaddeklaration
    let socket = 'http://localhost:8080';
    let request = new XMLHttpRequest();

    // öffnen des Socket für den POST
    request.open('POST', socket + '/saveSchedule/'+ username.value, false);

    // definieren, dass es sich um ein JSON im Body handelt
    request.setRequestHeader('Content-Type', 'application/json');

    // hier wird der JSON-Datensatz in den Body der POST-URI übergeben
    request.send('{"scheduleId": null,"exerciseNo": '+exerciseNo.value+
        ',"exerciseDesc": "'+exerciseDesc.value+
        '","sets": '+sets.value+
        ',"reps": '+reps.value+
        ',"breakSec": '+breakSec.value+
        ',"fitnessLevel": null,"heartFrequency": [1,2,3],"customer": null}');

    alert("Daten wurden zu " + username.value + " hinzugefügt");

    window.location.assign("http://localhost:8080/employeehome")
}
