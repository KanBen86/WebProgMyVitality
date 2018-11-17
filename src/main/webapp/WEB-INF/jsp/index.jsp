<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css"
              href="${pageContext.request.contextPath}resources/css/index.css"/>
    </jsp:attribute>
    <jsp:attribute name="header">
        <label>Index-Page</label>
    </jsp:attribute>
    <jsp:attribute name="main">

        <h1>Du bist nur ein Training von guter Laune entfernt - MyVitality</h1>

    </jsp:attribute>
</template:base>