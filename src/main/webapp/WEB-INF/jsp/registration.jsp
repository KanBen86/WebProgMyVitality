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

            <h1>Konto anlegen</h1>

            <form name="RegistrationForm" onsubmit="return validateForm()" method="POST">

                <div class="container-fluid">

                    <div class="row">
                        <div class="col-md-4">
                            <label>Benutzername</label>
                        </div>
                        <div class="col-md-4">
                            <input id="username" name="username" required>
                        </div>
                    </div>

                    <!--<br>-->

                    <div class="row">
                        <div class="col-md-4">
                            <label>Passwort</label>
                        </div>
                        <div class="col-md-4">
                            <input id="password" name="password" required>
                        </div>
                    </div>

                    <!--<br>-->

                    <div class="row">
                        <div class="col-md-4">
                            <label>Passwort wiederholen</label>
                        </div>
                        <div class="col-md-4">
                            <input id="passwordRE" name="passwordRE" required>
                        </div>
                    </div>

                    <!--<br>-->

                    <div class="row">
                        <div class="col-md-4">
                            <input id="btn" type="submit" value="Registrieren"/>
                        </div>
                    </div>

                    <div id="error">${error}</div>

                </div>
            </form>
        </div>
    </jsp:attribute>
</template:base>