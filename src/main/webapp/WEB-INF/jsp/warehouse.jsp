<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title>MyVitality - Warehouse-System</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css"/>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/warehouse.css"/>
        <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resources/img/favicon32.ico" sizes="32x32">
        <script src="../../resources/js/warehouse.js"></script>
    </head>
    <body>
        <header>
            <img src="${pageContext.request.contextPath}/resources/img/Logo_MV.png" class="logo">
        </header>
        <main class="main">
            <img src="${pageContext.request.contextPath}/resources/img/under-construction_geek_man_01.png" class="construction">
            <h1>Dies ist die Seite f&uumlr die Lagerverwaltung</h1>
            <div class="addArticle" id="addArticle">
                <h1>Dies ist der Context der Lagerhaltung, an der Stelle ich einen Artikel hinzuf&uumlgen kann</h1>
                <div class="formular" id="formular">
                    <label for="barcode">Barcode:
                        <input name="barcode" id="barcode" class="barcode">0123456789</textarea>
                    </label>
                </div>
                <button name="btnSave" class="btnSave" id="btnSave" onclick="saveClicked">Speichern</button>
            </div>
            <div class="storrageOverview" id="storrageOverview">
                <h1>Dies ist der Context der Lagerhaltung, an der Stelle ich den Inhalt des Lager abrufen kann</h1>
            </div>
            <div class="warehouseMain" id="warehouseMain">
                <h1>Dies ist der Context der Lagerhaltung, an der Stelle ich meine Aktionen ausw&aumlhlen kann</h1>
                <button name="btnAddArticle" class="btnAddArticle" id="btnAddArticle" onclick="addArticleClicked(this)">Artikel hinzuf&uumlgen</button>
                <button name="btnShowStorrage" class="btnShowStorrage" id="btnShowStorrage" onclick="showStorrageClicked(this)">Lagerinhalt pr&uumlfen</button>
            </div>
        </main>
    </body>
</html>