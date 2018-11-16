<%@ page import="de.dhbw.myvitality.enums.ENUM_INGREDIENTS" %><%--
  Created by IntelliJ IDEA.
  User: Benjamin Kanzler
  Date: 18.10.2018
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

            <label class="w3-text-black"
                   id="articleId"><b>ArtikelId: </b>${article.getArticleId()}</label>
            <br>
            <label class="w3-text-black"><b>Bar-Code</b></label>
            <input id="barcode" class="w3-input w3-border w3-light-grey" type="text"
                   placeholder="Barcode" value="${article.getBarcode()}">

            <label class="w3-text-black"><b>Artikel-Bezeichnung</b></label>
            <input id="bezeichnung" class="w3-input w3-border w3-light-grey" type="text"
                   placeholder="Bezeichnung" value="${article.getDescription()}">

            <label class="w3-text-black"><b>Preis</b></label>
            <input id="preis" class="w3-input w3-border w3-light-grey" type="text"
                   placeholder="11.11" value="${article.getPrice()}">

            <label class="w3-text-black"><b>Liste der Inhaltsstoffe</b></label>
            <input id="ingredients" class="w3-input w3-border w3-light-grey" type="text"
                   placeholder="Bitte mit , trennen" value="${article.getIngredients()}">

            <label class="w3-text-black"><b>Information</b></label>
            <input  id="information" class="w3-input w3-border w3-light-grey" type="text"
                    placeholder="Bitte wichtige Informationen hinterlegen"
                    value="${article.getInformation()}">

            <label class="w3-text-black"><b>Rack-Sektor</b></label>
            <input id="rackSector" class="w3-input w3-border w3-light-grey" type="text"
                   placeholder="z. B. A-Z" value="${article.getStorrage().getRackSector()}">

            <label class="w3-text-black"><b>Rack-Korridor</b></label>
            <input id="rackCorridor" class="w3-input w3-border w3-light-grey" type="text"
                   placeholder="z. B. A-Z" value="${article.getStorrage().getRackcorridor()}">

            <label class="w3-text-black"><b>Regalboden</b></label>
            <input id="level" class="w3-input w3-border w3-light-grey" type="text"
                   placeholder="z. B. 1-10" value="${article.getStorrage().getLevel()}">

            <label class="w3-text-black"><b>Menge</b></label>
            <input id="amount" class="w3-input w3-border w3-light-grey" type="number"
                   placeholder="Angabe in der lagerüblichen Menge"
                   value="${article.getStorrage().getAmount()}">

            <button id="btn-add" class="w3-button w3-section w3-grey w3-padding w3-left"
                    onclick="addArticle()">Daten senden</button>
            <button id="btn-back" class="w3-button w3-section w3-grey w3-padding w3-right"
                    type="button" onclick="history.back()">zurück</button>
        </form>
    </jsp:attribute>
</template:base>
