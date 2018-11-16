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
    //Request öffnen durch Angaben der URI und Methode, Mapping im CustomerController
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
    var profileSettings_telephoneNumber=document.getElementById("profileSettings_telephoneNumber");

    //Http-Request Objekt erzeugen
    var request= new XMLHttpRequest();
    //Request öffnen durch Angaben der URI und Methode, Mapping im CustomerController
    request.open('POST','http://localhost:8080/profileSettings');
    //Übertragungsmethode definieren
    request.setRequestHeader('Content-Type', 'application/json');
    //Objekt übertragen
    request.send('{"firstname":"'+profileSettings_fullName.value+'",'+
        '"lastname":"'+profileSettings_fullName_two.value+'",'+
        '"adress":null,'+
        '"dateOfBirth":"'+profileSettings_gebdat.value+'",'+
        '"emailAddress":"'+profileSettings_emailAddress.value+'",'+
        '"username":"'+profileSettings_username.value+'",'+
        '"password":"'+profileSettings_password.value+'",'+
        '"phoneNo":"'+profileSettings_telephoneNumber.value+'",'+
        '"sex":null,'+
        '"accounts":null,'+
        '"customerId":"'+profileSettings_kundenID.value+'",'+
        '"billAdress":null,'+
        '"goal":null,'+
        '"trainingSchedules":null,'+
        '"fitnessLevel":null,'+
        '"preferredTypeOfPayment":null,'+
        '"deliveryAddress":null}');
}


