<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta charset="utf-8"/>
        <title>MyVitalityApp</title>
        <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet">
        <script src="../../resources/js/main.js"></script>
    </head>
    <body>
        <header>
            <img src="${pageContext.request.contextPath}/resources/img/Logo_MV.png" class="logo">
            <button name="login" id="login", class="login" onclick="changeText(this)">Login</button>
        </header>
        <main class="main">
            <img src="${pageContext.request.contextPath}/resources/img/under-construction_geek_man_01.png" class="construction">
            <h1>Baustelle: Hier entsteht eine neue App! Bald k&oumlnnen Sie hier Ihr pers&oumlnliches Fitness-Level verbessern!</h1>
        </main>
    </body>
</html>