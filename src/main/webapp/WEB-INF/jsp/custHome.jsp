<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<template:base>

    <jsp:attribute name="header">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/custHome.css"/>
        <script src="../../resources/js/custHome.js"></script>
    </jsp:attribute>

    <jsp:attribute name="body">

        <div class="container-fluid">

            <div class="row">

                <div class="col-lg">
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/resources/img/favicon32.ico">
                        <div class="card-body">
                            <h3 class="card-title">Account bearbeiten</h3>
                        </div>
                    </div>
                </div>



                <div class="col-lg">
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/resources/img/favicon32.ico">
                        <div class="card-body">
                            <h3 class="card-title">Nahrungsergänzung</h3>
                        </div>
                    </div>
                </div>

                <div class="col-lg">
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/resources/img/favicon32.ico">
                        <div class="card-body">
                            <h3 class="card-title">Fitness Level</h3>
                        </div>
                    </div>
                </div>

            </div>

        </div>

    </jsp:attribute>
</template:base>