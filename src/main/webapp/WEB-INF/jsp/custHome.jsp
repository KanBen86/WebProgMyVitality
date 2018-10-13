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
            <div class="row no-gutters">
                <div class="col-md-4">
                    <img src="${pageContext.request.contextPath}/resources/img/favicon32.ico">
                </div>
                <div class="col-md-4">
                    <img src="${pageContext.request.contextPath}/resources/img/favicon32.ico">
                </div>
                <div class="col-md-4">
                    <img src="${pageContext.request.contextPath}/resources/img/favicon32.ico">
                </div>
            </div>
        </div>
    </jsp:attribute>
</template:base>