<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="template" tagdir="/WEB-INF/tags/templates" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<template:base>
    <jsp:attribute name="head">
        <link rel="stylesheet" type="text/css"
              href="${pageContext.request.contextPath}resources/css/index.css"/>
        <script src="../../resources/js/index.js"></script>
    </jsp:attribute>
    <jsp:attribute name="header">
        <label>Index-Page</label>
    </jsp:attribute>
    <jsp:attribute name="main">

        <!--
        <h1>OUR PAIN YOUR GAIN!</h1>
        <div class="embed-responsive embed-responsive-16by9">
            <iframe class="embed-responsive-item" src="https://giphy.com/embed/1iTH1WIUjM0VATSw" allowfullscreen></iframe>
        </div>
        -->
        
    </jsp:attribute>
</template:base>