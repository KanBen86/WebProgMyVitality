<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<template:base>

    <jsp:attribute name="header">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/preexerciselevel.css"/>
        <script src="../../resources/js/preexerciselevel.js"></script>
    </jsp:attribute>

    <jsp:attribute name="main">
        <html>
            <head>
                <title>Ausgangslevel</title>
            </head>
            <body>
                <h2>Ausgangslevel</h2>

                <dl>
                    <dt><label for="preexerciselevel_sex">Geschlecht: </label>
                        <select id="preexerciselevel_sex"><option value="op0">Männlich</option><option value="op1">Weiblich</option></select></dt>
                    <dt><label for="preexerciselevel_weight">Gewicht: </label>
                        <input type="number" id="preexerciselevel_weight" name="preexerciselevel_weight"></dt>
                    <dt><label for="preexerciselevel_height">Körpergröße: </label>
                        <input type="number" id="preexerciselevel_height" name="preexerciselevel_height"></dt>
                    <dt><label for="preexerciselevel_experience">Trainingserfahrung: </label>
                        <input type="range" id="preexerciselevel_experience" name="preexerciselevel_experience"></dt>
                    <dt><label for="preexerciselevel_job">Berufliche Tätigkeit: </label>
                        <select id="preexerciselevel_job"><option value="op2">Stehend</option><option value="op3">Sitzend</option><option value="op4">Wechselhaft</option></select></dt>
                    <dt id="preexerciselevel_body">Körperumfänge (optional)</dt>
                    <dt><label for="preexerciselevel_arm">Oberarm: </label>
                        <input type="text" id="preexerciselevel_arm" name="preexerciselevel_arm"></dt>
                    <dt><label for="preexerciselevel_chest">Brust: </label>
                        <input type="text" id="preexerciselevel_chest" name="preexerciselevel_chest"></dt>
                    <dt><label for="preexerciselevel_stomach">Bauch: </label>
                        <input type="text" id="preexerciselevel_stomach" name="preexerciselevel_stomach"></dt>
                    <dt><label for="preexerciselevel_waist">Taille: </label>
                        <input type="text" id="preexerciselevel_waist" name="preexerciselevel_waist"></dt>
                    <dt><label for="preexerciselevel_thigh">Oberschenkel: </label>
                        <input type="text" id="preexerciselevel_thigh" name="preexerciselevel_thigh"></dt>
                    <dt><label for="preexerciselevel_calves">Waden: </label>
                        <input type="text" id="preexerciselevel_calves" name="preexerciselevel_calves"></dt>
                    <dt id="preexerciselevel_foodIntolerance">Nahrungsmittelunverträglichkeit <button id="preexerciselevel_button_plus_one" type="button">+</button></dt>
                    <dt><label for="preexerciselevel_foodIntolerance_firstText">1.) </label>
                        <input type="text" id="preexerciselevel_foodIntolerance_firstText" name="preexerciselevel_foodIntolerance_firstText"></dt>
                    <dt id="preexerciselevel_injuries">Verletzungen <button id="preexerciselevel_button_plus_two" type="button">+</button></dt>
                    <dt><label for="preexerciselevel_injuries_firstText">1.) </label>
                        <input type="text" id="preexerciselevel_injuries_firstText" name="preexerciselevel_injuries_firstText"></dt>
                    <dt id="preexerciselevel_medicine">Medikamente <button id="preexerciselevel_button_plus_three" type="button">+</button></dt>
                    <dt><label for="preexerciselevel_medicine_firstText">1.) </label>
                        <input type="text" id="preexerciselevel_medicine_firstText" name="preexerciselevel_medicine_firstText"></dt>
                </dl>

                <!--<form>
                    <label for="number">Körpergröße</label>
                    <input type="number" id="number">
                    <label for="range">Trainingserfahrung</label>
                    <input type="range" id="range">
                </form>-->

                <button id="preexerciselevel_button_save" type="button">Speichern</button>
            </body>
        </html>
    </jsp:attribute>
</template:base>