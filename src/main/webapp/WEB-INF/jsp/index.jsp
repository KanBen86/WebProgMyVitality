<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css"
              href="${pageContext.request.contextPath}resources/css/index.css"/>
        <script src="../../resources/js/index.js"></script>
    </jsp:attribute>
    <jsp:attribute name="header">
        <label>Index-Page</label>
    </jsp:attribute>
    <jsp:attribute name="main">
            <img
                    src="${pageContext.request.contextPath}/resources/img/under-construction_geek_man_01.png">
            <h1>Baustelle: Hier entsteht eine neue App! Bald k&oumlnnen Sie hier Ihr pers&oumlnliches Fitness-Level verbessern!</h1>
    </jsp:attribute>
</template:base>