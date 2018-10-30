<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page pageEncoding="UTF-8" %>

<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login.css"/>
        <script type="application/javascript" src="${pageContext.request.contextPath}/resources/js/login.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </jsp:attribute>
    <jsp:attribute name="main">

                <p>
                <img src="/resources/img/Logo_MV.png" class="img-responsive" id="loginLogo" style="max-width: 245px">
                </p>

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
                                <input type="checkbox" id="rememberMe" name="rememberMe" value="remember">Remember me</label>
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
                                <a class="links" id="forgot" href="">Passwort vergessen?</a>
                            </div>
                        </div>

                        <div id="error">${error}</div>

                    </div>
                </form>
    </jsp:attribute>
</template:base>