package de.dhbw.myvitality.controller;

import de.dhbw.myvitality.entities.Article;
import de.dhbw.myvitality.services.ArticleService;
import de.dhbw.myvitality.services.StorrageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private StorrageService storrageService;
    /**
     *  Diese Methode liefert einen Artikel an die GUI
     * @author Benjamin Kanzler
     */
    @RequestMapping("Artikel/{id}")
    public Article findById(@PathVariable("id") String id) {
        LOG.info("Was vom Client übergeben wurde: " + id);
        return articleService.findById(id).get();
    }

    /**
     * Post Schnitstelle zum erzeugen eines Artikels in der DB
     * @author Benjamin Kanzler
     */
    @RequestMapping(method = RequestMethod.POST, value = "/saveArtikel/{articleId}")
    public void persistArticle(@RequestBody Article article,
                               @PathVariable("articleId") String articleId){
        LOG.info("Der folgende Artikel wurde übergeben: " + article.toString());
        LOG.info("Es wurde folgende ArtikelId übergeben: " + articleId);
        if (articleId != null && articleId != "" && articleId != "undefined"){
            Article oldArticle = articleService.findById(articleId).get();
            //Artikelwerte anpassen
            if(oldArticle.getDescription()!=article.getDescription())oldArticle.setDescription(article.getDescription());
            if(oldArticle.getPrice()!=article.getPrice())oldArticle.setPrice(article.getPrice());
            if(oldArticle.getBarcode()!=article.getBarcode())oldArticle.setBarcode(article.getBarcode());
            if(oldArticle.getAllergens()!=article.getAllergens())oldArticle.setAllergens(article.getAllergens());
            if(oldArticle.getInformation()!=article.getInformation())oldArticle.setInformation(article.getInformation());
            if(oldArticle.getIngredients()!=article.getIngredients())oldArticle.setIngredients(article.getIngredients());
            // Storragewerte anpassen
            if(oldArticle.getStorrage().getAmount()!=article.getStorrage().getAmount())oldArticle.getStorrage().setAmount(article.getStorrage().getAmount());
            if(oldArticle.getStorrage().getLevel()!=article.getStorrage().getLevel())oldArticle.getStorrage().setLevel(article.getStorrage().getLevel());
            if(oldArticle.getStorrage().getRackcorridor()!=article.getStorrage().getRackcorridor())oldArticle.getStorrage().setRackcorridor(article.getStorrage().getRackcorridor());
            if(oldArticle.getStorrage().getRackSector()!=article.getStorrage().getRackSector())oldArticle.getStorrage().setRackSector(article.getStorrage().getRackSector());
            storrageService.save(oldArticle.getStorrage());
            articleService.save(oldArticle);
            return;
        }
        LOG.info("Die ArtikelID war leer -> neuer Artikel anlegen: " + article.getArticleId());
        article.setArticleId(null);
        storrageService.save(article.getStorrage());
        articleService.save(article);
    }
}
