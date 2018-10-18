<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/mySupplements.css"/>
        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
        <script type="text/javascript" src="../../resources/js/mySupplements.js"></script>

    </jsp:attribute>

    <jsp:attribute name="main">
    <h1>Deine Nahrungserzänzung</h1>
        <div id="tableArea">
            <table id="table">
                <tr>
                    <th>Id</th>
                    <th>Beschreibung</th>
                    <th>Preis</th>
                </tr>
                <c:forEach items="${list}" var="list">
                        <tr>
                            <td>${list.getArticleId()}</td>
                            <td>${list.getDescription()}</td>
                            <td>${list.getPrice()}</td>
                        </tr>
                </c:forEach>
            </table>
        </div>

    <br>
    <button onclick="refreshTable()" id="aktualisieren">Aktualisieren</button>

    </jsp:attribute>
</template:base>