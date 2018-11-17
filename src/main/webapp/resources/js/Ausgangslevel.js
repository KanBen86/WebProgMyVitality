function speichereExerciseDaten(){
    var username=document.getElementById("username");
    var sex=document.getElementById("sex");
    var weight=document.getElementById("weight");
    var height=document.getElementById("height");
    var experience=document.getElementById("experience");
    var job=document.getElementById("job");
    var arm=document.getElementById("arm");
    var chest=document.getElementById("chest");
    var stomach=document.getElementById("stomach");
    var waist=document.getElementById("waist");
    var thigh=document.getElementById("thigh");
    var calves=document.getElementById("calves");
    var foodIntolerance=document.getElementById("foodIntolerance");
    var injuries=document.getElementById("injuries");
    var medicine=document.getElementById("medicine");

    //Http-Request Objekt erzeugen
    var request= new XMLHttpRequest();

        //Auslesen der Daten vom DOM
    //Request öffnen durch Angaben der URI und Methode, Mapping im CustomerController
    request.open('POST','http://localhost:8080/savePreexerciselevel/'+username.innerText,false);
    //Übertragungsmethode definieren
    request.setRequestHeader('Content-Type', 'application/json');
    //Objekt übertragen
    request.send('{"fitnessLevelId":null,'+
        '"sex":"'+sex.value+'",'+
        '"weight":"'+weight.value+'",' +
        '"height":"'+height.value+'",' +
        '"experience":"'+experience.value+'",' +
    '"job":"'+job.value+'",' +
     '"arm":"'+arm.value+'",' +
     '"chest":"'+chest.value+'",' +
      '"stomach":"'+stomach.value+'",' +
      '"waist":"'+waist.value+'",' +
      '"thigh":"'+thigh.value+'",' +
      '"calf":"'+calves.value+'",' +
      '"foodIntolerance":"'+foodIntolerance.value+'",' +
      '"injury":"'+injuries.value+'",' +
      '"medicine":"'+medicine.value+'"}');
}

