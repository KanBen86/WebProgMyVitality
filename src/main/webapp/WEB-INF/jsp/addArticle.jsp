<%@ page import="de.dhbw.myvitality.enums.ENUM_INGREDIENTS" %><%--
  Created by IntelliJ IDEA.
  User: Benjamin Kanzler
  Date: 18.10.2018
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page pageEncoding="UTF-8" %>
<template:base>
    <jsp:attribute name="head">
        <script type="application/javascript" src="../../resources/js/addArticle.js"></script>
    </jsp:attribute>
    <jsp:attribute name="main">
        <form class="w3-container background-darkolivegreen">
            <div class="w3-container w3-green">
                <h2>Artikel hinzuf&uumlgen</h2>
            </div>

            <label class="w3-text-white"><b>Bar-Code</b></label>
            <input id="barcode" class="w3-input w3-border w3-light-green" type="number"
                placeholder="Barcode">

            <label class="w3-text-white"><b>Artikel-Bezeichnung</b></label>
            <input id="bezeichung" class="w3-input w3-border w3-light-green" type="text"
                placeholder="Bezeichnung">

            <label class="w3-text-white"><b>Preis</b></label>
            <input id="preis" class="w3-input w3-border w3-light-green" type="number"
                   placeholder="11.11">

            <table id="inhaltsstoffe">
                <tr>
                    <th>Inhaltsstoff</th>
                </tr>
                <c:forEach items="<%=ENUM_INGREDIENTS.values()%>" var="ingredient">
                    <tr class="w3-hoverable">
                        <td>
                            <option>${ingredient.name()}</option>
                        </td>
                    </tr>
                </c:forEach>
            </table>

            <button id="btn-add" class="w3-button w3-section w3-green w3-padding"
                    onclick="addArticle()">Daten senden</button>
        </form>
    </jsp:attribute>
</template:base>
