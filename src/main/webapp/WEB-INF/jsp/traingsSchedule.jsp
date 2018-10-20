<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css" href="../resources/css/trainingsSchedule.css"/>
        <script src="../../resources/js/traingsSchedule.js"></script>
    </jsp:attribute>

    <jsp:attribute name="main">

        <h1> Traingsplan &Uumlbersicht</h1>

        <div id="KundenauswahlBeiTP">

        </div>

        <div id="BisherigeTpAnzeigen">

        </div>

    </jsp:attribute>
</template:base>
