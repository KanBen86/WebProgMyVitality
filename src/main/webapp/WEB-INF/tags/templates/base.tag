<%@tag pageEncoding="UTF-8"%>

<%@attribute name="head" fragment="true" %>
<%@attribute name="header" fragment="true" %>
<%@attribute name="main" fragment="true" %>
<%@attribute name="footer" fragment="true" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8"/>
        <title>MyVitalityApp</title>
        <!-- Bootstrap CND
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        -->
        <!-- benutzerdefinierte Styles und Scripte -->
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}resources/css/main.css"/>
        <!-- Platzhalter für den Head-Inhalt -->
        <jsp:invoke fragment="head"/>
        <!-- Icon für den Tabreiter des Browsers -->
        <link rel="icon" type="image/png" href="${pageContext.request.contextPath}resources/img/favicon32.ico" sizes="32x32">
    </head>
    <body id="app">
        <header id="header">
            <!-- Platzhalter für den Header-Inhalt -->
            <div class="logo" id="logo">
                <img src="${pageContext.request.contextPath}resources/img/Logo_MV.png" class="logoIcon"/>
            </div>
            <div class="page-title" id="page-title">
                <jsp:invoke fragment="header"/>
            </div>
            <div class="login">
                <button class="col-md-2" id="login" type="button" onclick="switchToLogin()">Login</button>
            </div>

        </header>

        <main id="main" class="padding">
            <!-- Platzhalter für den Body-Inhalt -->
            <jsp:invoke fragment="main"/>
        </main>

        <footer id="footer">
            <!-- Platzhalter für den Footer-Inhalt -->
            <jsp:invoke fragment="footer"/>
            <nav>
                <ul>
                    <li>Erster Bulletpoint</li>
                    <li>Zweiter Bulletpoint</li>
                </ul>
                <ul>
                    <li>Dritter Bulletpoint</li>
                    <li>Vierter Bulletpoint</li>
                </ul>
            </nav>
        </footer>
    </body>
</html>