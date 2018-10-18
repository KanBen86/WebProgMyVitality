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

                <div class="col-lg">
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/resources/img/favicon32.ico">
                        <div class="card-body">
                            <h3 class="card-title">Trainingsplan</h3>
                        </div>
                    </div>
                </div>

                <div class="col-lg">
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/resources/img/favicon32.ico">
                        <div class="card-body">
                            <h3 class="card-title">Warenwirtschaft</h3>
                        </div>
                    </div>
                </div>

            </div>

        </div>

    </jsp:attribute>
</template:base>