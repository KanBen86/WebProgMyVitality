<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css" href="../resources/css/trainingsSchedule.css"/>
        <script src="../../resources/js/traingsSchedule.js"></script>
    </jsp:attribute>

    <jsp:attribute name="main">

        <div class="container-fluid">

            <div class="row">
                <div class="col-md-4">
                    <label id="benutzername">Benutzername:</label>
                </div>
                <div class="col-md-4">
                    <input class="w3-input w3-border w3-light-green" id="username" name="username" required>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4">
                    <label id="uebungsnummer">Übungsnummer</label>
                </div>
                <div class="col-md-4">
                    <input class="w3-input w3-border w3-light-green" id="exerciseNo" name="exNumber" required>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4">
                    <label id="uebungsname">Übungsname:</label>
                </div>
                <div class="col-md-4">
                    <input class="w3-input w3-border w3-light-green" id="exerciseDesc" name="exerciseDesc" required>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4">
                    <label id="satzzahl">Satzanzahl:</label>
                </div>
                <div class="col-md-4">
                    <input class="w3-input w3-border w3-light-green" id="sets" name="sets" required>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4">
                    <label id="wiederholung">Wiederholungszahl:</label>
                </div>
                <div class="col-md-4">
                    <input class="w3-input w3-border w3-light-green" id="reps" name="reps" required>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4">
                    <label id="pausenzeit">Pausenzeit:</label>
                </div>
                <div class="col-md-4">
                    <input class="w3-input w3-border w3-light-green" id="breakSec" name="weight" required>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4">
                    <label id="informationen">Information:</label>
                </div>
                <div class="col-md-4">
                    <input class="w3-input w3-border w3-light-green" id="info" name="info" required>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4">
                    <button id="btn-add-ts" onclick="addTrainingsschedule()">Daten senden</button>
                </div>
            </div>
        </div>

    </jsp:attribute>
</template:base>
