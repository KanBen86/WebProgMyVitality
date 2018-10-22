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

            <p>
                <!--<img src="/resources/img/Logo_MV.png" class="img-responsive" id="loginLogo" style="max-width: 382px">-->
                <img src="/resources/img/Logo_MV.png" class="img-fluid" alt="Responsive image">
            </p>

            <form method="POST" onsubmit="validateForm(event)">

                <div class="col-md">
                    <label class="col-md-4"><div id="error">${error}</div></label>
                </div>
                <div class="col-md">
                    <label class="col-md-4">Benutzername: <input class="col-md-4" id="username" name="username"></label>
                </div>
                <div class="col-md">
                    <label class="col-md-4">Passwort: <input class="col-md-4" type="password" id="password" name="password"></label>
                </div>
                <div class="col-md">
                    <label class="col-md-4"><input type="checkbox" id="rememberMe" name="rememberMe">Remember me</label>
                </div>
                <div class="col-md">
                    <label class="col-md-4"><input id="btn" type="submit" value="Login"></label>
                </div>
                <div class="col-md">
                    <label class="col-md-4">
                        <a href="">Registrieren</a>
                        <a href="">Passwort vergessen?</a>
                    </label>
                </div>

            </form>

        </div>
    </jsp:attribute>
</template:base>