<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<template:base>
    <jsp:attribute name="body">
        <header>
            <img src="${pageContext.request.contextPath}/resources/img/Logo_MV.png" class="logo">
            <button name="login" id="login" class="login" onclick="changeText(this)">Login</button>
        </header>
        <main class="main">
            <img src="${pageContext.request.contextPath}/resources/img/under-construction_geek_man_01.png" class="construction">
            <h1>Baustelle: Hier entsteht eine neue App! Bald k&oumlnnen Sie hier Ihr pers&oumlnliches Fitness-Level verbessern!</h1>
        </main>
    </jsp:attribute>
</template:base>