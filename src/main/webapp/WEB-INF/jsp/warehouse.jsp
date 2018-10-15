<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page pageEncoding="UTF-8" %>
<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/warehouse.css">
    </jsp:attribute>
    <jsp:attribute name="body">
        <div class="main">
            <img src="${pageContext.request.contextPath}/resources/img/under-construction_geek_man_01.png" class="construction">
            <h1>Dies ist die Seite f&uumlr die Lagerverwaltung</h1>
            <div class="col-md-8" id="auswahlfenster">
                <div class="card">
                    <img src="../../resources/img/Barcode.png" class="col-md-4" onclick="addArticleClicked(this)"sizes="64x64">
                </div>
                <div class="card">
                    <img src="../../resources/img/Storrage_icon.png" class="col-md-4" onclick="showStorrageClicked(this)" sizes="64x64">
                </div>
            </div>
        </div>
    </jsp:attribute>
</template:base>
