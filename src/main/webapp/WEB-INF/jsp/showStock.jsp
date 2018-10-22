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
            <table class="w3-table w3-bordered w3-responsive w3-small">
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Points</th>
                </tr>
                <tr class="w3-hoverable">
                    <td>Jill</td>
                    <td>Smith</td>
                    <td>50</td>
                </tr>
                <tr class="w3-hoverable">
                    <td>John</td>
                    <td>Doe</td>
                    <td>102</td>
                </tr>
            </table>
            <button class="w3-button">Zurück</button>

    </jsp:attribute>
</template:base>
