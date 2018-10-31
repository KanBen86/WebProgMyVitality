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

                <p>
                <img src="/resources/img/Logo_MV.png" class="img-responsive" id="loginLogo" alt="MyVitality-Logo" style="max-width: 245px">
                </p>

                <!-- Eingabeform für die Logindaten und mögliche Alternativen ("Registrieren"/ "Passwort vergessen?")-->
                <form name="LoginForm" onsubmit="validateLoginForm()" method="POST">

                    <div class="container-fluid">

                        <div class="row">

                            <div class="col-md-4">
                                <input class="w3-input w3-border w3-light-green" id="username" name="username" placeholder="Benutzername" required>
                            </div>
                        </div>

                        <div class="row">

                            <div class="col-md-4">
                                <input type="password" class="w3-input w3-border w3-light-green" id="password" name="password" placeholder="Passwort" required>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-4">
                                <input id="btn" type="submit" value="Login">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-4">
                                <a class="links" id="register" href="/registration">Registrieren</a>
                                <p class="links" id="forgot" onclick="forgottenPassword()">Passwort vergessen?</p>
                            </div>
                        </div>

                        <div id="error">${error}</div>

                    </div>
                </form>

                <!-- Zunächst versteckte Eingabeform für den Kundennutzernamen, im Fall "Passwort vergessen?")-->
                <form id="passwordForgottenForm" name="passwordForgottenForm" onsubmit="sendMail()" method="POST" style="display: none;">

                    <div class="container-fluid">

                        <div class="row">

                            <div class="col-md-4">
                                <input class="w3-input w3-border w3-light-green" id="usernameFP" name="usernameFP" placeholder="Kundennutzername" required>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-4">
                                <input id="btnFP" type="submit" value="Passwort per Mail senden">
                            </div>
                        </div>

                    </div>

                </form>

    </jsp:attribute>
</template:base>