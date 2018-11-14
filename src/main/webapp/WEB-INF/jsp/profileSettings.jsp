<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<template:base>

    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/profileSettings.css"/>
        <script src="../../resources/js/profileSettings.js"></script>
    </jsp:attribute>

    <jsp:attribute name="main">
        <html>
            <head>
                <title>Profileinstellungen</title>
            </head>
            <body>
                <h2>Profileinstellungen</h2>
                <table>
                <thead>
                <tr>
                    <th id="profileSettings_header_person">Person</th>
                    <th id="profileSettings_header_profileSettings"> <a href="/preexerciselevel">Ausgangslevel</a></th>
                </tr>
                </thead>
                </table>
                <!--<tr>
                    <th scope="row">1</th>
                    <td>Person</td>
                    <td>Adresse</td>
                    <td>Bankdaten</td>
                    <td>Profileinstellungen</td>
                </tr>-->
                <dl>
                    <dt><input class="w3-input w3-border w3-light-grey" id="profileSettings_kundenID" ></dt>
                    <dt><label for="profileSettings_fullName">Vorname: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="profileSettings_fullName" name="profileSettings_fullName"></dt>
                    <dt><label for="profileSettings_fullName_two">Nachname: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="profileSettings_fullName_two" name="profileSettings_fullName_two"></dt>
                    <dt><label for="profileSettings_emailAddress">E-Mail Adresse: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="profileSettings_emailAddress" name="profileSettings_emailAddress"></dt>
                    <dt><label for="profileSettings_address">Adresse: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="profileSettings_address" name="profileSettings_address"></dt>
                    <dt><label for="profileSettings_gebdat">Geburtsdatum:
                        <input class="w3-input w3-border w3-light-grey" type="date" id="profileSettings_gebdat"></label></dt>
                    <dt><label for="profileSettings_username">Username: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="profileSettings_username" name="profileSettings_username"></dt>
                    <dt><label for="profileSettings_password">Passwort: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="profileSettings_password" name="profileSettings_password"></dt>
                    <dt><label for="profileSettings_telephoneNumber">Telefonnummer: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="profileSettings_telephoneNumber" name="profileSettings_telephoneNumber"></dt>
                    <dt><label for="profileSettings_sex">Geschlecht: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="profileSettings_sex" name="profileSettings_sex"></dt>
                </dl>
                <button class="w3-button w3-section w3-grey w3-padding w3-left" id="profileSettings_button" type="button" onclick="validiereDaten()">Änderungen übernehmen</button>
            </body>
        </html>

    </jsp:attribute>
</template:base>