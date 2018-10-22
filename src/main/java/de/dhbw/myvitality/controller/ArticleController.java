package de.dhbw.myvitality.controller;

import de.dhbw.myvitality.entities.Article;
import de.dhbw.myvitality.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/***
 * Mappt die Http Anfragen auf eine Serviceinstanz
 * @author Tamino Fischer alias CodeKeks
 */
@RestController
public class ArticleController {

    /**
     * Macht die Serviceklasse des Repositories für die DB-Zugriffe auf die Tabelle Article bekannt;
     *
     * @author Benjamin Kanzler
     */

    @Autowired
    private ArticleService articleService;

    /**
     *
     * @author Benjamin Kanzler
     */
    @RequestMapping("/addArtikel/{id}")
    public Optional<Article> findById(@PathVariable("id") String id) {
        return articleService.findById(id);
    }

}
