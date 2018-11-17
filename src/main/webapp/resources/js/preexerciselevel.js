function getCostumer(){
    alert("getCustomer wurde aufgerufen");
    //Auslesen der Daten vom DOM
    var profileSettings_kundenID=document.getElementById("profileSettings_kundenID");
    var profileSettings_fullName=document.getElementById("profileSettings_fullName");
    var profileSettings_fullName_two=document.getElementById("profileSettings_fullName_two");
    var profileSettings_emailAddress=document.getElementById("profileSettings_emailAddress");
    var profileSettings_address=document.getElementById("profileSettings_address");
    var profileSettings_gebdat=document.getElementById("profileSettings_gebdat");
    var profileSettings_username=document.getElementById("profileSettings_username");
    var profileSettings_password=document.getElementById("profileSettings_password");

    //Http-Request Objekt erzeugen
    var request= new XMLHttpRequest();
    //Request öffnen durch Angaben der URI und Methode, Mapping im FitnesslevelController
    request.open('GET','http://localhost:8080/customerProfile/11111',false);
    request.send(null);

    if (request.status === 200) {
        customer = JSON.parse(request.responseText);
        profileSettings_fullName.value=customer.firstname;
    }
}
/**
 * Daten validieren, ob sinnvoller Inhalt drinsteht
 */
function validiereDaten(){
    //Auslesen der Daten vom DOM
    var preexerciselevel_username=document.getElementById("preexerciselevel_username");
    var preexerciselevel_fitnessLevelId=document.getElementById("preexerciselevel_fitnessLevelId");
    var preexerciselevel_sex=document.getElementById("preexerciselevel_sex");
    var preexerciselevel_weight=document.getElementById("preexerciselevel_weight");
    var preexerciselevel_height=document.getElementById("preexerciselevel_height");
    var preexerciselevel_experience=document.getElementById("preexerciselevel_experience");
    var preexerciselevel_job=document.getElementById("preexerciselevel_job");
    var preexerciselevel_arm=document.getElementById("preexerciselevel_arm");
    var preexerciselevel_chest=document.getElementById("preexerciselevel_chest");
    var preexerciselevel_stomach=document.getElementById("preexerciselevel_stomach");
    var preexerciselevel_waist=document.getElementById("preexerciselevel_waist");
    var preexerciselevel_thigh=document.getElementById("preexerciselevel_thigh");
    var preexerciselevel_calves=document.getElementById("preexerciselevel_calves");
    var preexerciselevel_foodIntolerance=document.getElementById("preexerciselevel_foodIntolerance");
    var preexerciselevel_injuries=document.getElementById("preexerciselevel_injuries");
    var preexerciselevel_medicine=document.getElementById("preexerciselevel_medicine");

    //Http-Request Objekt erzeugen
    var request= new XMLHttpRequest();
    //Request öffnen durch Angaben der URI und Methode, Mapping im CustomerController
    request.open('POST','http://localhost:8080/savePreexerciselevel/'+preexerciselevel_username.value);
    //Übertragungsmethode definieren
    request.setRequestHeader('Content-Type', 'application/json');
    //Objekt übertragen
    request.send('{"fitnessLevelId":"'+preexerciselevel_fitnessLevelId.value+'",'+
        '"sex":"'+preexerciselevel_sex.value+'",'+
        '"weight":"'+preexerciselevel_weight.value+'",' +
        '"height":"'+preexerciselevel_height.value+'",' +
        '"experience":"'+preexerciselevel_experience.value+'",' +
        '"job":"'+preexerciselevel_job.value+'",' +
        '"arm":"'+preexerciselevel_arm.value+'",' +
        '"chest":"'+preexerciselevel_chest.value+'",' +
        '"stomach":"'+preexerciselevel_stomach.value+'",' +
        '"waist":"'+preexerciselevel_waist.value+'",' +
        '"thigh":"'+preexerciselevel_thigh.value+'",' +
        '"calf":"'+preexerciselevel_calves.value+'",' +
        '"foodIntolerance":"'+preexerciselevel_foodIntolerance.value+'",' +
        '"injury":"'+preexerciselevel_injuries.value+'",' +
        '"medicine":"'+preexerciselevel_medicine.value+'"}');
}


