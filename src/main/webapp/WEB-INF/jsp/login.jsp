<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page pageEncoding="UTF-8" %>

<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login.css"/>
    </jsp:attribute>
    <jsp:attribute name="main">
        <div class="col-md">

            <form method="POST" onsubmit="validateForm(event)">

                <div class="col-md">
                    <label class="col-md-4">Benutzername: <input class="col-md-4" id="username" name="username"></label>
                </div>
                <div class="col-md">
                    <label class="col-md-4">Passwort: <input class="col-md-4" type="password" id="password" name="password"></label>
                </div>
                <div class="col-md">
                    <input id="btn" type="submit" value="Login">
                </div>

            </form>

            <div id="error">
                ${error}

            </div>
        </div>
    </jsp:attribute>
</template:base>