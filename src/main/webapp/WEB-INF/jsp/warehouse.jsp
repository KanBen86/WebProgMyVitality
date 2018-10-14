<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page pageEncoding="UTF-8" %>
<template:base>
    <jsp:attribute name="body">
        <main class="main">
            <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/warehouse.css">
            <img src="${pageContext.request.contextPath}/resources/img/under-construction_geek_man_01.png" class="construction">
            <h1>Dies ist die Seite f&uumlr die Lagerverwaltung</h1>
            <div class="col-md-8">
                <img src="${pageContext.request.contextPath}/resources/img/Barcode.pgn" class="col-md-4" onclick="addArticleClicked(this)"sizes="64x64">
                <img src="${pageContext.request.contextPath}/resources/img/Storrage_icon.pgn" class="col-md-4" onclick="showStorrageClicked(this)" sizes="64x64">
            </div>
        </main>
    </jsp:attribute>
</template:base>
