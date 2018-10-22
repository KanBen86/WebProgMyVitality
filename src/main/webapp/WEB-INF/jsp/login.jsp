<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page pageEncoding="UTF-8" %>

<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login.css"/>
        <script type="application/javascript" src="../../resources/js/login.js"></script>
        <!--<meta name="viewport" content="width=device-width, initial-scale=1">-->
    </jsp:attribute>
    <jsp:attribute name="main">
        <!--<div onload="myFunction()" style="margin:0;">-->

            <!--<div id="loader"></div>-->

            <!--<div style="display:none;" id="myDiv" class="animate-bottom">-->

                <p>
                <img src="/resources/img/Logo_MV.png" class="img-responsive" id="loginLogo" style="max-width: 245px">
                </p>

                <form name="LoginForm" onsubmit="validateForm(event)" method="POST">

                    <div class="container-fluid">

                        <div class="row">
                            <div class="col-md-4">
                                <label>Benutzername</label>
                            </div>
                            <div class="col-md-4">
                                <input id="username" name="username" required>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-4">
                                <label>Passwort</label>
                            </div>
                            <div class="col-md-4">
                                <input type="password" id="password" name="password" required>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-4">
                                <input type="checkbox" id="rememberMe" name="rememberMe">Remember me</label>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-4">
                                <input id="btn" type="submit" value="Login">
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-4">
                                <a href="/registration">Registrieren</a>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-4">
                                <a href="">Passwort vergessen?</a>
                            </div>
                        </div>

                        <div id="error">${error}</div>

                    </div>
                </form>
           <!--</div>-->
        <!--</div>-->
    </jsp:attribute>
</template:base>