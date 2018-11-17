<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page pageEncoding="UTF-8" %>
<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/warehouse.css">
    </jsp:attribute>
    <jsp:attribute name="main">
        <div class="main">
            <div class="row">
                <a href="/addArticle">
                    <div class="w3-card-4 col-md-6 w3-hover-shadow w3-center">
                        <img src="../../resources/img/Barcode.png" alt="Barcode">
                        <div class="w3-container w3-center">
                            <p>Artikel hinzufügen</p>
                        </div>
                    </div>
                </a>
                <a href="/showStock">
                    <div class="w3-card-4 col-md-6 w3-center">
                        <img src="../../resources/img/Storrage_icon.png"
                             onclick="showStorrageClicked(this)" alt="Lager">
                        <div class="w3-container w3-center">
                            <p>Lagerinhalt anzeigen</p>
                        </div>
                    </div>
                </a>
            </div>
        </div>
    </jsp:attribute>
</template:base>
