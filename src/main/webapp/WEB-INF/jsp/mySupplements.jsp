<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/mySupplements.css"/>

        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
        <script type="text/javascript" src="../../resources/js/mySupplements.js"></script>

    </jsp:attribute>

    <jsp:attribute name="main">

    <h1>Deine Nahrungserzänzung</h1>

        <div id="piechart"></div>

        <div id="tableArea">
            <table id="table">
                <tr>
                    <th>Artikel</th>
                    <th>Dosierung</th>
                    <th>Info</th>
                </tr>

                <c:forEach var="i" begin="0" end= "${fn:length(artileList)-1}" step="1">
                        <tr>
                            <td>${artileList.get(i).getDescription()}</td>
                            <td>${quantityList.get(i)}</td>
                            <td>${informationList.get(i)}</td>
                        </tr>
                </c:forEach>

            </table>
        </div>

    <br>
    <button onclick="refreshTable()" id="aktualisieren">Aktualisieren</button>

    </jsp:attribute>
</template:base>