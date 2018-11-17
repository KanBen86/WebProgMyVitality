<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<template:base>

    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/preexerciselevel.css"/>
        <script src="../../resources/js/Ausgangslevel.js"></script>
    </jsp:attribute>

    <jsp:attribute name="main">
        <html>
            <head>
                <title>Ausgangslevel</title>
            </head>
            <body>
            <div class="w3-container w3-green">
                <h2>Ausgangslevel</h2>
            </div>

                <dl>
                    <label id="username" hidden="true">${preexercise_username}</label>
                    <dt><label for="sex">Geschlecht: </label>
                        <select class="w3-input w3-border w3-light-grey" id="sex" value="${fitnessLevel.getSex()}"><option>Männlich</option><option>Weiblich</option></select></dt>
                    <dt><label for="weight">Gewicht: </label>
                        <input class="w3-input w3-border w3-light-grey" type="number" id="weight" name="weight" value="${fitnessLevel.getWeight()}" ></dt>
                    <dt><label for="height">Körpergröße: </label>
                        <input class="w3-input w3-border w3-light-grey" type="number" id="height" name="height" value="${fitnessLevel.getHeight()}" ></dt>
                    <dt><label for="experience">Trainingserfahrung: </label>
                        <input class="w3-input w3-border w3-light-grey" type="range" id="experience" name="experience" value="${fitnessLevel.getExperience()}" ></dt>
                    <dt><label for="job">Berufliche Tätigkeit: </label>
                        <select class="w3-input w3-border w3-light-grey" id="job" value="${fitnessLevel.getJob()}"><option>Stehend</option><option>Sitzend</option><option>Wechselhaft</option></select></dt>
                    <dt id="body">Körperumfänge (optional)</dt>
                    <dt><label for="arm">Oberarm: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="arm" name="arm" value="${fitnessLevel.getArm()}"></dt>
                    <dt><label for="chest">Brust: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="chest" name="chest" value="${fitnessLevel.getChest()}"></dt>
                    <dt><label for="stomach">Bauch: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="stomach" name="stomach" value="${fitnessLevel.getStomach()}"></dt>
                    <dt><label for="waist">Taille: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="waist" name="waist" value="${fitnessLevel.getWaist()}"></dt>
                    <dt><label for="thigh">Oberschenkel: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="thigh" name="thigh" value="${fitnessLevel.getThigh()}"></dt>
                    <dt><label for="calves">Waden: </label>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="calves" name="calves" value="${fitnessLevel.getCalf()}"></dt>
                    <dt>Nahrungsmittelunverträglichkeit (Komma separiert)</dt>
                    <dt>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="foodIntolerance" name="foodIntolerance" value="${fitnessLevel.getFoodIntolerance()}"></dt>
                    <dt>Verletzungen (Komma separiert)</dt>
                    <dt>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="injuries" name="injuries" value="${fitnessLevel.getInjury()}"></dt>
                    <dt>Medikamente (Komma separiert)</dt>
                    <dt>
                        <input class="w3-input w3-border w3-light-grey" type="text" id="medicine" name="medicine" value="${fitnessLevel.getMedicine()}"></dt>
                </dl>

                <!--<form>
                    <label for="number">Körpergröße</label>
                    <input type="number" id="number">
                    <label for="range">Trainingserfahrung</label>
                    <input type="range" id="range">
                </form>-->

                <button class="w3-button w3-section w3-grey w3-padding w3-left" id="button_save" type="button" onclick="speichereExerciseDaten()">Speichern</button>
                <button id="btn-back" class="w3-button w3-section w3-grey w3-padding w3-right" type="button" onclick="history.back()">zurück</button>
            </body>
        </html>
    </jsp:attribute>
</template:base>