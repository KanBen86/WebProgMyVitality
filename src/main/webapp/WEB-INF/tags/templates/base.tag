<%@tag pageEncoding="UTF-8"%>

<%@attribute name="header" fragment="true" %>
<%@attribute name="body" fragment="true" %>
<%@attribute name="footer" fragment="true" %>

<!DOCTYPE html>
<html>
    <head>
        <!-- Platzhalter für den Head-Inhalt -->
        <jsp:invoke fragment="head"/>
        <meta charset="utf-8"/>
        <title>MyVitalityApp</title>

        <!-- Bootstrap CND -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <!-- benutzerdefinierte Styles und Scripte -->
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css"/>
        <script src="../../resources/js/main.js"></script>
        <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resources/img/favicon32.ico" sizes="32x32">
    </head>
    <body>

        <header>
            <!-- Platzhalter für den Header-Inhalt -->
            <img src="${pageContext.request.contextPath}/resources/img/Logo_MV.png" class="col-sm-4">
            <label name="login" id="login" class="col-sm-4" onmouseover="mouseoverLogin(this)" onmouseleave="mouseleaveLogin(this)" onclick="changeText(this)">Login</label>

            <jsp:invoke fragment="header"/>
            <h1>HEADER</h1>
        </header>

        <main>
            <!-- Platzhalter für den Body-Inhalt -->
            <jsp:invoke fragment="body"/>
        </main>

        <footer>
            <!-- Platzhalter für den Footer-Inhalt -->
            <jsp:invoke fragment="footer"/>
            <h1>FOOTER</h1>
        </footer>

    </body>
</html>