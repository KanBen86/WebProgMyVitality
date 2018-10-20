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
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}resources/css/main.css"/>
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
                    <a class="navbar-brand" href="/">
                            <img src="../../../resources/img/Logo_MV.png" class="img-responsive"
                                 alt="Logo" style="max-width: 100px">
                    </a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="/">Home</a></li>
                        <li><a href="#">About</a></li>
                        <li><a href="#">Projects</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="/login" id="login-text" onclick="loginLogout()"><span
                                class="glyphicon glyphicon-log-in"></span>
                            Login
                        </a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="container-fluid text-center background-olivedrab">
            <div class="row content">
                <div class="col-sm-2 sidenav">
                    <p><a href="#">Link</a></p>
                    <p><a href="#">Link</a></p>
                    <p><a href="#">Link</a></p>
                </div>
                <div class="col-sm-8 text-left background-darkolivegreen">
                    <!-- Platzhalter für den main-Inhalt -->
                    <jsp:invoke fragment="main"/>
                </div>
                <div class="col-sm-2 sidenav">
                    <div class="well">
                        <p><img src="${pageContext.request.contextPath}/resources/img/under-construction_geek_man_01.png" class="img-responsive" style="max-width: 128px"></p>
                    </div>
                    <div class="well">
                        <p>ADS</p>
                    </div>
                </div>
            </div>
        </div>

        <footer class="container-fluid text-center">
            <!-- Platzhalter für den Footer-Inhalt -->
            <jsp:invoke fragment="footer"/>
            <nav class="navbar navbar-inverse" style="background-color: #555555">
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