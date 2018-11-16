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
    var profileSettings_kundenID=document.getElementById("profileSettings_kundenID");
    var profileSettings_fullName=document.getElementById("profileSettings_fullName");
    var profileSettings_fullName_two=document.getElementById("profileSettings_fullName_two");
    var profileSettings_emailAddress=document.getElementById("profileSettings_emailAddress");
    var profileSettings_address=document.getElementById("profileSettings_address");
    var profileSettings_gebdat=document.getElementById("profileSettings_gebdat");
    var profileSettings_username=document.getElementById("profileSettings_username");
    var profileSettings_password=document.getElementById("profileSettings_password");
    var profileSettings_phoneNo=document.getElementById("profileSettings_phoneNo");

    //Http-Request Objekt erzeugen
    var request= new XMLHttpRequest();
    //Request öffnen durch Angaben der URI und Methode, Mapping im CustomerController
    request.open('POST','http://localhost:8080/preexerciselevel');
    //Übertragungsmethode definieren
    request.setRequestHeader('Content-Type', 'application/json');
    //Objekt übertragen
    request.send({"fitnessLevelId":null,"sex":null,"weight":null,"height":null,"experience":null,"job":null,"arm":null,"chest":null,"stomach":null,"waist":null,"thigh":null,"calf":null,"foodIntolerance":null,"injury":null,"medicine":null});
}


