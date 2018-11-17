<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page pageEncoding="UTF-8" %>

<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login.css"/>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script type="application/javascript" src="${pageContext.request.contextPath}/resources/js/login.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </jsp:attribute>
    <jsp:attribute name="main">

        <div class="loginCenter">
                <!-- Eingabeform für die Logindaten und mögliche Alternativen ("Registrieren"/ "Passwort vergessen?")-->
                <form name="LoginForm" onsubmit="validateLoginForm()" method="POST">

                    <div class="container-fluid">

                        <!-- Logo -->
                        <div class="row">
                            <div class="col-md-4"></div>

                            <div class="col-md-4">
                                <p><img src="/resources/img/Logo_MV.png" class="img-responsive" id="loginLogo" alt="MyVitality-Logo" style="max-width: 245px"></p>
                            </div>
                        </div>

                        <!-- Feld für Benutzername -->
                        <div class="row">
                            <div class="col-md-4"></div>

                            <div class="col-md-4">
                                <input class="w3-input w3-border w3-light-grey" id="username" name="username" placeholder="Benutzername" required>
                            </div>
                        </div>

                        <!-- Feld für Passwort -->
                        <div class="row">
                            <div class="col-md-4"></div>

                            <div class="col-md-4">
                                <input type="password" class="w3-input w3-border w3-light-grey" id="password" name="password" placeholder="Passwort" required>
                            </div>
                        </div>

                        <!-- Button -->
                        <div class="row">
                            <div class="col-md-4"></div>
                            <div class="col-md-4">
                                <input id="btn" class="w3-button w3-section w3-grey w3-padding w3-left" type="submit" value="Login">
                            </div>
                        </div>

                        <!-- Links -->
                        <div class="row">
                            <div class="col-md-4"></div>
                            <div class="col-md-4">
                                <a class="links" id="register" href="/registration">Registrieren</a>
                                <p class="links" id="forgot" onclick="forgottenPassword()">Passwort vergessen?</p>
                            </div>
                        </div>

                        <!-- Error- und Statusmeldungen-->
                        <div class="row">
                            <div class="col-md-4"></div>
                            <div class="col-md-4">
                                <div id="error">${error}</div>
                            </div>
                        </div>

                    </div>
                </form>

                <!-- Zunächst versteckte Eingabeform für den Kundennutzernamen, im Fall "Passwort vergessen?")-->
                <form id="passwordForgottenForm" name="passwordForgottenForm" onsubmit="sendMail()" method="POST" style="display: none;">

                    <div class="container-fluid">

                        <div class="row">
                            <div class="col-md-4"></div>

                            <div class="col-md-4">
                                <input class="w3-input w3-border w3-light-grey" id="usernameFP" name="usernameFP" placeholder="Kundennutzername" required>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-4"></div>

                            <div class="col-md-4">
                                <input class="w3-button w3-section w3-grey w3-padding w3-left" id="btnFP" type="submit" value="Passwort per Mail">
                                <button class="w3-button w3-section w3-grey w3-padding w3-right" onclick="loginBack()">Zurück</button>
                            </div>
                        </div>

                    </div>

                </form>
        </div>
    </jsp:attribute>
</template:base>