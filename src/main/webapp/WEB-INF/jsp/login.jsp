<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page pageEncoding="UTF-8" %>

<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login.css"/>
    </jsp:attribute>
    <jsp:attribute name="body">
        <div class="col-md">
            <div class="col-md">
                <label class="col-md-4">Benutzername: <input class="col-md-4" id="username"></label>
            </div>
            <div class="col-md">
                <label class="col-md-4">Passwort: <input class="col-md-4" type="password" id="password"></label>
            </div>
        </div>
    </jsp:attribute>
</template:base>