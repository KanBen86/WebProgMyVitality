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
            <div class="w3-container w3-green">
                <h2>Profileinstellungen</h2>
            </div>
                <table>
                <thead>
                <tr>
                    <th id="profileSettings_header_person">Person</th>
                    <th id="profileSettings_header_profileSettings"> <a href="/preexerciselevel">Ausgangslevel</a></th>
                </tr>
                </thead>
                </table>

                <dl>
                    <dt><input class="w3-input w3-border w3-light-grey" id="profileSettings_kundenID" value="${customer.getCustomerId()}" ></dt>
                    <dt><label for="profileSettings_fullName">Vorname: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="profileSettings_fullName" value="${customer.getFirstname()}" name="profileSettings_fullName"></dt>
                    <dt><label for="profileSettings_fullName_two">Nachname: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="profileSettings_fullName_two" value="${customer.getLastname()}" name="profileSettings_fullName_two"></dt>
                    <dt><label for="profileSettings_emailAddress">E-Mail Adresse: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="profileSettings_emailAddress" value="${customer.getEmailAddress()}" name="profileSettings_emailAddress"></dt>
                    <dt><label for="profileSettings_address">Adresse: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="profileSettings_address" value="${customer.getAdress()}" name="profileSettings_address"></dt>
                    <dt><label for="profileSettings_gebdat">Geburtsdatum:
                        <input class="w3-input w3-border w3-light-grey" type="date" id="profileSettings_gebdat" value="${customer.getDateOfBirth()}"></label></dt>
                    <dt><label for="profileSettings_username">Username: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="profileSettings_username" name="profileSettings_username" value="${customer.getUsername()}"></dt>
                    <dt><label for="profileSettings_password">Passwort: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="profileSettings_password" name="profileSettings_password" value="${customer.getPassword()}"></dt>
                    <dt><label for="profileSettings_telephoneNumber">Telefonnummer: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="profileSettings_telephoneNumber" name="profileSettings_telephoneNumber" value="${customer.getPhoneNo()}"></dt>
                    <dt><label for="profileSettings_sex">Geschlecht: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="profileSettings_sex" name="profileSettings_sex" value="${customer.getSex()}"></dt>
                </dl>
                <button class="w3-button w3-section w3-grey w3-padding w3-left" id="profileSettings_button" type="button" onclick="validiereDaten()">Änderungen übernehmen</button>
                <button id="btn-back" class="w3-button w3-section w3-grey w3-padding w3-right" type="button" onclick="history.back()">zurück</button>
            </body>
        </html>

    </jsp:attribute>
</template:base>