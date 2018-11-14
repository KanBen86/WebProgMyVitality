<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page pageEncoding="UTF-8" %>

<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/scheduleOverview.css"/>
        <script src="../../resources/js/scheduleOverview.js"></script>
    </jsp:attribute>

    <jsp:attribute name="main">

         <h1>Dein Trainingsplan</h1>

        <div id="tableArea">
            <table id="table" class="w3-table w3-bordered w3-responsive w3-center w3-hoverable">
                <thead>
                    <tr>
                        <th>Übungsnummer</th>
                        <th>Übungsname</th>
                        <th>Sets</th>
                        <th>Reps</th>
                        <th>Pausenzeit</th>
                    </tr>
                </thead>


                <c:forEach var="i" begin="0" end= "${fn:length(trainingScheduleList)-1}" step="1">
                        <tr>
                            <td>${trainingScheduleList.get(i).exerciseNo}</td>
                            <td>${trainingScheduleList.get(i).exerciseDesc}</td>
                            <td>${trainingScheduleList.get(i).sets}</td>
                            <td>${trainingScheduleList.get(i).reps}</td>
                            <td>${trainingScheduleList.get(i).breakSec}</td>

                        </tr>
                </c:forEach>

            </table>
        </div>

    </jsp:attribute>
</template:base>
