<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<template:base>
    <jsp:attribute name="header">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/mySupplements.css"/>

        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
                <script type="text/javascript" src="../../resources/js/mySupplements.js"></script>




    </jsp:attribute>

    <jsp:attribute name="body">
    <h1>Ihre Nahrungsergänzungsmittel</h1>

    <div id="piechart"></div>

    </jsp:attribute>
</template:base>