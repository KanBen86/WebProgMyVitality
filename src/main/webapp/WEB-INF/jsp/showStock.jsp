<%--
  Created by IntelliJ IDEA.
  User: Benjamin Kanzler
  Date: 18.10.2018
  Time: 10:38
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
            <table class="w3-table w3-bordered w3-responsive w3-small w3-center" id="storrage">
                <tr>
                    <th>ID</th>
                    <th>Bezeichnug</th>
                    <th>Lagermenge</th>
                </tr>
                <c:forEach items="${map}" var="map">
                        <tr>
                            <td>${map.value.getArticleId()}</td>
                            <td>${map.value.getDescription()}</td>
                            <td>${map.key.getAmout()}</td>
                        </tr>
                </c:forEach>
            </table>
            <button class="w3-button">Zurück</button>

    </jsp:attribute>
</template:base>
