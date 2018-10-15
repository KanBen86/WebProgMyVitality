<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<template:base>

    <jsp:attribute name="header">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/preexerciselevel.css"/>
        <script src="../../resources/js/preexerciselevel.js"></script>
    </jsp:attribute>

    <jsp:attribute name="body">
        TestBody

    </jsp:attribute>
</template:base>