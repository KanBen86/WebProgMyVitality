<%@tag pageEncoding="UTF-8"%>

<%@attribute name="head" fragment="true" %>
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
        <!--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css"/>-->
        <script src="../../resources/js/main.js"></script>
        <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resources/img/favicon32.ico" sizes="32x32">
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.bundle.min.js" integrity="sha384-pjaaA8dDz/5BgdFUPX6M/9SUZv4d12SUPF0axWc+VRZkx5xU3daN+lYb49+Ax+Tl" crossorigin="anonymous"></script>
    </head>
    <body>
        <header>
            <!-- Platzhalter für den Header-Inhalt -->
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