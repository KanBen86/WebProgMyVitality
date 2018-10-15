<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page pageEncoding="UTF-8" %>

<template:base>
    <jsp:attribute name="header">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/traingsSchedule.css"/>
        <script src="../../resources/js/traingsSchedule.js"></script>
    </jsp:attribute>

    <jsp:attribute name="body">
        <div>
            <h2> test 123 </h2>
        </div>
    </jsp:attribute>
</template:base>
