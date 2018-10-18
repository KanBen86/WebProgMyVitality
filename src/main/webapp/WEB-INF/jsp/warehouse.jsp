<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page pageEncoding="UTF-8" %>
<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/warehouse.css">
        <script type="application/javascript" src="../../resources/js/warehouse.js"></script>
    </jsp:attribute>
    <jsp:attribute name="main">
        <div class="main">
            <div class="row">
                <div class="card">
                    <img src="../../resources/img/Barcode.png" class="col-md-4 img-responsive"
                         onclick="addArticleClicked(this)">
                </div>
                <div class="card">
                    <img src="../../resources/img/Storrage_icon.png"
                         class="col-md-4 img-respronsive"
                         onclick="showStorrageClicked(this)">
                </div>
            </div>
        </div>
    </jsp:attribute>
</template:base>
