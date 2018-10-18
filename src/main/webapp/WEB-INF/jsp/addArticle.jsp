<%--
  Created by IntelliJ IDEA.
  User: Benjamin Kanzler
  Date: 18.10.2018
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page pageEncoding="UTF-8" %>
<template:base>
    <jsp:attribute name="head">
        <script type="application/javascript" src="../../resources/js/warehouse.js"></script>
    </jsp:attribute>
    <jsp:attribute name="main">
        <form class="w3-container background-darkolivegreen">
            <div class="w3-container w3-green">
                <h2>Input Form</h2>
            </div>

            <label class="w3-text-white"><b>Bar-Code</b></label>
            <input class="w3-input w3-border w3-light-green" type="number">

            <label class="w3-text-white"><b>Artikel-Bezeichnung</b></label>
            <input class="w3-input w3-border w3-light-green" type="text">

            <button class="w3-button w3-section w3-green w3-block w3-padding">Artikel
                anlegen</button>
        </form>
    </jsp:attribute>
</template:base>
