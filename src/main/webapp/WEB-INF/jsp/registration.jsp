<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page pageEncoding="UTF-8" %>

<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/registration.css"/>
        <script type="application/javascript" src="../../resources/js/registration.js"></script>
    </jsp:attribute>
    <jsp:attribute name="main">
        <div class="col-md">

            <!-- Eingabeform für die Registrierungsdaten -->
            <form name="RegistrationForm" onsubmit="return validateRegistrationForm()" method="POST">

                <div class="w3-container w3-green">
                    <h2>Konto anlegen</h2>
                </div>

                <div class="container-fluid">

                    <!-- Feld für Benutzername -->
                    <div class="row">
                        <div class="col-md-4">
                            <label>Benutzername</label>
                        </div>
                        <div class="col-md-4">
                            <input 	class="w3-input w3-border w3-light-grey" id="username" name="username" placeholder="Benutzername" required>
                        </div>
                    </div>

                    <!-- Feld für Passwort -->
                    <div class="row">
                        <div class="col-md-4">
                            <label>Passwort</label>
                        </div>
                        <div class="col-md-4">
                            <input 	class="w3-input w3-border w3-light-grey" id="password" name="password" placeholder="Passwort" required>
                        </div>
                    </div>

                    <!-- Feld für Passwort wiederholen-->
                    <div class="row">
                        <div class="col-md-4">
                            <label>Passwort wiederholen</label>
                        </div>
                        <div class="col-md-4">
                            <input 	class="w3-input w3-border w3-light-grey" id="passwordRE" name="passwordRE" placeholder="Passwort wiederholen" required>
                        </div>
                    </div>

                    <!-- Feld für E-Mail -->
                    <div class="row">
                        <div class="col-md-4">
                            <label>E-Mail</label>
                        </div>
                        <div class="col-md-4">
                            <input 	class="w3-input w3-border w3-light-grey" id="email" name="email" placeholder="E-Mail" required>
                        </div>
                    </div>

                    <!-- Feld für E-Mail wiederholen -->
                    <div class="row">
                        <div class="col-md-4">
                            <label>E-Mail wiederholen</label>
                        </div>
                        <div class="col-md-4">
                            <input 	class="w3-input w3-border w3-light-grey" id="emailRE" name="emailRE" placeholder="E-Mail wiederholen" required>
                        </div>
                    </div>

                    <!-- Button -->
                    <div class="row">
                        <div class="col-md-4">
                        </div>

                        <div class="col-md-4">
                            <input class="w3-button w3-section w3-grey w3-padding w3-left" id="btn" type="submit" value="Registrieren"/>
                            <button class="w3-button w3-section w3-grey w3-padding w3-right" onclick="history.back()">Zurück</button>
                        </div>
                    </div>

                    <!-- Error- und Statusmeldungen-->
                    <div class="row">
                        <div class="col-md-4">
                        </div>

                        <div class="col-md-4">
                            <div id="error">${error}</div>
                        </div>
                    </div>

                </div>
            </form>
        </div>
    </jsp:attribute>
</template:base>