<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page pageEncoding="UTF-8" %>

<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/registration.css"/>
    </jsp:attribute>
    <jsp:attribute name="body">
        <h1>Konto anlegen</h1>
        <div class="col-md">
            <label class="col-md-4">Vollständiger Name: <input class="col-md-4" id="name"></label>
            <label class="col-md-4">E-Mail Adresse: <input class="col-md-4" id="mailadress"></label>
        </div>

    </jsp:attribute>
</template:base>