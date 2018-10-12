<%@tag pageEncoding="UTF-8"%>

<%@attribute name="header" fragment="true" %>
<%@attribute name="body" fragment="true" %>
<%@attribute name="footer" fragment="true" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="style.css" />
    </head>
    <body>

        <header>
            <!-- Platzhalter für den Header-Inhalt -->
            <jsp:invoke fragment="header"/>
        </header>

        <main>
            <!-- Platzhalter für den Body-Inhalt -->
            <jsp:invoke fragment="body"/>
        </main>

        <footer>
            <!-- Platzhalter für den Footer-Inhalt -->
            <jsp:invoke fragment="footer"/>
        </footer>

    </body>
</html>