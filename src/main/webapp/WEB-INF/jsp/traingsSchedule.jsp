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
                    <label>Benutzername:</label>
                </div>
                <div class="col-md-4">
                    <input class="w3-input w3-border w3-light-green" id="username" name="username" required>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4">
                    <label>Übungsnummer</label>
                </div>
                <div class="col-md-4">
                    <input class="w3-input w3-border w3-light-green" id="exNumber" name="exNumber" required>
                </div>
            </div

            <div class="row">
                <div class="col-md-4">
                    <label>Satzanzahl:</label>
                </div>
                <div class="col-md-4">
                    <input class="w3-input w3-border w3-light-green" id="sets" name="sets" required>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4">
                    <label>Wiederholungszahl:</label>
                </div>
                <div class="col-md-4">
                    <input class="w3-input w3-border w3-light-green" id="reps" name="reps" required>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4">
                    <label>Gewicht:</label>
                </div>
                <div class="col-md-4">
                    <input class="w3-input w3-border w3-light-green" id="weight" name="weight" required>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4">
                    <label>Information:</label>
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
