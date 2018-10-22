<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page pageEncoding="UTF-8" %>

<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/registration.css"/>
    </jsp:attribute>
    <jsp:attribute name="main">
        <h1>Konto anlegen</h1>

        <form method="POST" onsubmit="validateForm(event)">
            <div class="container-fluid">

                <div class="row">
                    <div class="col-md-4">
                        <label>Benutzername</label>
                    </div>
                    <div class="col-md-4">
                        <input id="username" name="username">
                    </div>
                </div>

                <br>

                <div class="row">
                    <div class="col-md-4">
                        <label>Passwort</label>
                    </div>
                    <div class="col-md-4">
                        <input id="password" name="password">
                    </div>
                </div>

                <br>

                <div class="row">
                    <div class="col-md-4">
                        <input id="btn" type="submit" value="Registrieren"/>
                    </div>
                    <div id="error">${error}</div>
                </div>

                <br>

            </div>
        </form>

    </jsp:attribute>
</template:base>