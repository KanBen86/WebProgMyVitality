package de.dhbw.myvitality.controller;

import de.dhbw.myvitality.entities.Article;
import de.dhbw.myvitality.enums.ENUM_ALLERGEN;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(ServerReSTController.BASE_URI)
public class ServerReSTController {

    public static final String BASE_URI = "contact/server";

    /**
     * @author KanBen86
     *
     * Diese Methode stellt eine ReST-Schnitstelle zur Verfügung, auf die der WebClient zugreifen kann, um Artikel aus der Datenbank auszulesen.
     *
     * @param articleId
     * @return
     */
    @RequestMapping(value = "/get/article/{articleId}")
    public Article getArticle (@PathVariable final String articleId){
        // hier kann man dann einen Artikel aus der Datenbank auslesen
        Article article = new Article();
        article.setArticleId(articleId);
        article.setAllergens(new ArrayList<ENUM_ALLERGEN>());
        article.getAllergens().add(ENUM_ALLERGEN.LACTOSE);
        return article;
    }

    /**
     * @author KanBen86
     *
     * Diese Methode stellt eine ReST-Schnitstelle zur Verfügung, auf die der WebClient zugraifen kann, um einen Artikel in die Datenbank zu speichern.
     */
    @RequestMapping(value = "/set/article/{article}", method = RequestMethod.POST)
    public String setArticle (@PathVariable final Article article){
        // hier kann man einen Artikel in das System spreichern
        System.out.println(article.toString());
        return article.toString();
    }

}