package de.dhbw.myvitality.controller;

import de.dhbw.myvitality.entities.Article;
import de.dhbw.myvitality.services.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/***
 * Mappt die Http Anfragen auf eine Serviceinstanz
 * @author Tamino Fischer alias CodeKeks
 */
@RestController
public class ArticleController {

    private static final Logger LOG = LoggerFactory.getLogger(ArticleController.class);
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
    @RequestMapping("Artikel/{id}")
    public Optional<Article> findById(@PathVariable("id") String id) {
        LOG.info("Was vom Client übergeben wurde: " + id);
        return articleService.findById(id);
    }

    /**
     * Post Schnitstelle zum erzeugen eines Artikels in der DB
     * @author Benjamin Kanzler
     */
    @RequestMapping(method = RequestMethod.POST, value = "/Artikel")
    public void persistArticle(@RequestBody Article article){
        LOG.info("Daten sind an den Server übergeben: " + article);
        articleService.save(article);
    }
}
