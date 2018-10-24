<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<template:base>

    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/emplHome.css"/>
        <script src="../../resources/js/emplHome.js"></script>
    </jsp:attribute>

    <jsp:attribute name="main">

        <div class="container-fluid">

            <div class="row">
                <div class="col-md-4">


                    <a href="/trainingsschedule">
                        <div class="card" >
                            <img src="${pageContext.request.contextPath}/resources/img/favicon32.ico" alt="Avatar" style="width:100%">
                            <div class="container">
                                <h4><b>Trainingsplan</b></h4>
                                <p>Erstelle Trainingsplan!</p>
                            </div>
                        </div>
                    </a>


                </div>
                <div class="col-md-4">

                    <a href="/warehouse">
                        <div class="card">
                            <img src="${pageContext.request.contextPath}/resources/img/favicon32.ico" alt="Avatar" style="width:100%">
                            <div class="container">
                                <h4><b>Warenwirtschaft</b></h4>
                                <p>Verwalte die Waren!</p>
                            </div>
                        </div>
                    </a>
                </div>
            </div>

        </div>

    </jsp:attribute>
</template:base>