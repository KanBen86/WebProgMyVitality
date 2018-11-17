<%@tag pageEncoding="UTF-8"%>

<%@attribute name="head" fragment="true" %>
<%@attribute name="header" fragment="true" %>
<%@attribute name="main" fragment="true" %>
<%@attribute name="footer" fragment="true" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>MyVitalityApp</title>
        <!-- Bootstrap CND -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <!-- benutzerdefinierte Styles und Scripte -->
        <link rel="stylesheet" type="text/css" href="../../../resources/css/main.css"/>
        <!-- Platzhalter für den Head-Inhalt -->
        <jsp:invoke fragment="head"/>
        <!-- Icon für den Tabreiter des Browsers -->
        <link rel="icon" type="image/png" href="${pageContext.request.contextPath}resources/img/favicon32.ico" sizes="32x32">





    </head>
    <body class="container" id="app">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="${home}">
                            <img src="../../../resources/img/Logo_MV.png" class="img-responsive" alt="Logo" style="max-width: 100px">
                    </a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <!--Darstellung des Homebereichs abhängig vom Zugriff als Mitarbeiter oder Kunde durch JavaExpressionLanguage-->
                        <li><a id="tester" href="${home}">Home</a></li>
                        <li><a href="#">About</a></li>
                        <li><a href="#">Projects</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <!--Darstellung der Loginfunktion mit einem Icon + variables Textfeld durch JavaExpressionLanguage-->
                        <li><a href="/login" id="login-text" onclick="loginLogout()"><span
                                class="glyphicon glyphicon-log-in"></span>
                            ${loginLogoutText}
                        </a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="container-fluid text-center background-olivedrab" id="content-area">
            <div class="row content">

                <div class="col-sm-12 text-left">
                    <!-- Platzhalter für den main-Inhalt -->
                    <jsp:invoke fragment="main"/>
                </div>

            </div>
        </div>
        <!-- Platzhalter für den Footer-Inhalt -->
        <footer id="fid" class="container-fluid text-center">
            <jsp:invoke fragment="footer"/>
            <nav class="navbar navbar-inverse">
                <div class="container-fluid">
                    <div class="navbar-footer">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbarFooter">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <div class="collapse navbar-collapse" id="myNavbarFooter">
                        <ul class="nav navbar-nav">
                            <li><a href="#">Impressum</a></li>
                            <li><a href="#">AGB</a></li>
                            <li><a href="#">Social Media</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </footer>
    </body>
</html>