<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<template:base>

    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/custHome.css"/>
        <!--Meta-Tags für HTTP um das automatische Ablegen der Seite im Browser-Cache zu unterbinden
        und somit Zurückspringen mit der Browsernavigation nach dem Logout zu verhindern(Sven)-->
        <meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
        <meta http-equiv="Pragma" content="no-cache" />
        <meta http-equiv="Expires" content="0" />

        <script src="../../resources/js/custHome.js"></script>
    </jsp:attribute>

    <jsp:attribute name="main">

        <!--Funktion für HTTP um das automatische Ablegen der Seite im Browser-Cache zu unterbinden
        und somit Zurückspringen mit der Browsernavigation nach dem Logout zu verhindern(Sven)

            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
            response.setHeader("Pragma", "no-cache"); // HTTP 1.0
            response.setHeader("Expires", "0"); // Proxies

        -->

        <div class="container-fluid">

            <div class="row">
                <div class="col-md-4">
                    <a href="/profilesettings">
                        <div class="card">
                            <img src="${pageContext.request.contextPath}/resources/img/favicon32.ico" alt="Avatar" style="width:100%">
                            <div class="container">
                                <h4><b>Profil</b></h4>
                                <p>Ändere dein Profil!</p>
                            </div>
                        </div>
                    </a>


                </div>
                <div class="col-md-4" >
                    <a href="/mysupplements">
                        <div class="card">
                            <img src="${pageContext.request.contextPath}/resources/img/favicon32.ico" alt="Avatar" style="width:100%">
                            <div class="container">
                                <h4><b>Nahrungsergänzung</b></h4>
                                <p>Was nimmst du?</p>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-md-4">
                    <a href="/scheduleoverview">
                        <div class="card">
                            <img src="${pageContext.request.contextPath}/resources/img/favicon32.ico" alt="Avatar" style="width:100%">
                            <div class="container">
                                <h4><b>Trainingsplan</b></h4>
                                <p>Wie ist dein Plan?</p>
                            </div>
                        </div>
                    </a>
                </div>
            </div>

        </div>

    </jsp:attribute>
</template:base>