<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page pageEncoding="UTF-8" %>

<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/scheduleOverview.css"/>
        <script src="../../resources/js/scheduleOverview.js.js"></script>
    </jsp:attribute>

    <jsp:attribute name="main">

        <h1> Traingsplan &Uumlbersicht</h1>

        <form action="">
            Kunde wählen:
            <input type="text" id="traingsschedule_name" maxlength="15">
            <br>

            <div class="dropdown">
                Bisherige Trainingspl&aumlne:
                <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Auswahl
                    <span class="caret"></span></button>
                <ul class="dropdown-menu">
                    <li><a href="#">Trainingsplan vom 01.01.2010</a></li>
                    <li><a href="#">Trainingsplan vom 05.05.2015</a></li>
                    <li><a href="#">Trainingsplan vom 10.10.2020</a></li>
                </ul>

                <button type="button"> Anzeigen</button>
            </div>


            <div id="trainingsSchedule_OverviewTable">
                <table>
                    <tr>
                        <th>Nummer</th>
                        <th>&Uumlbung</th>
                        <th>Satzzahl </th>
                        <th>Wiederholungen</th>
                        <th>Gewicht</th>
                        <th>Information</th>

                    </tr>
                    <tr>
                        <td>1</td>
                        <td>Beispiel&uumlbung</td>
                        <td>3</td>
                        <td>15-20</td>
                        <td>15</td>
                        <td>Allgemeine Information</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>Beispiel&uumlbung</td>
                        <td>3</td>
                        <td>15-20</td>
                        <td>15</td>
                        <td>Allgemeine Information</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>Beispiel&uumlbung</td>
                        <td>3</td>
                        <td>15-20</td>
                        <td>15</td>
                        <td>Allgemeine Information</td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td>Beispiel&uumlbung</td>
                        <td>3</td>
                        <td>15-20</td>
                        <td>15</td>
                        <td>Allgemeine Information</td>
                    </tr>
                </table>
            </div>

        </form>




    </jsp:attribute>
</template:base>
