<%@ page import="de.dhbw.myvitality.services.ArticleService" %>
<%@ page import="de.dhbw.myvitality.services.StorrageService" %><%--
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
        <script type="application/javascript"
                src="../../resources/js/showStock.js"></script>
    </jsp:attribute>
    <jsp:attribute name="main">

        <div class="w3-container w3-green">
            <h2>Lagerinhalt</h2>
        </div>

            <table class="w3-table w3-bordered w3-responsive w3-small w3-center w3-hoverable"
                   id="storrage" name="lager">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Bezeichnug</th>
                        <th>Sektor</th>
                        <th>Korridor</th>
                        <th>Regalboden</th>
                        <th>Menge</th>
                    </tr>
                </thead>
                <c:forEach items="${articleList}" var="article">
                    <tr>
                        <td onclick="openArticleEditView(this.innerHTML)">${article.getArticleId()}</td>
                        <td>${article.getDescription()}</td>
                        <td>${article.getStorrage().getRackSector()}</td>
                        <td>${article.getStorrage().getRackcorridor()}</td>
                        <td>${article.getStorrage().getLevel()}</td>
                        <td>${article.getStorrage().getAmount()}</td>
                    </tr>
                </c:forEach>
            </table>
            <button class="w3-button w3-section w3-grey w3-padding w3-right" onclick="history.back()">Zurück</button>

    </jsp:attribute>
</template:base>
