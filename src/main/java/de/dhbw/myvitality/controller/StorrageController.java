package de.dhbw.myvitality.controller;

import de.dhbw.myvitality.entities.Article;
import de.dhbw.myvitality.entities.Storrage;
import de.dhbw.myvitality.services.ArticleService;
import de.dhbw.myvitality.services.StorrageService;
import org.hibernate.Hibernate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/***
 * Mappt die Http Anfragen auf eine Serviceinstanz
 * @author Tamino Fischer alias CodeKeks
 */
@RestController
public class StorrageController {

    private final static Logger LOG = LoggerFactory.getLogger(StorrageController.class);

    /**
     * Service bekannt machen
     * @author Benjamin Kanzler
     */
    @Autowired
    public StorrageService storrageService;

    @Autowired
    public ArticleService articleService;

    /**
     * Diese Methode liefert eine Liste des Lagerinhalten, sobald von JavaScript ein
     * http-request auf die angegebene URI abgesetzt wird.
     *
     * @return gibt eine Liste des Lagerinhaltes zurück
     * @author Benjamin Kanzler
     */
    @RequestMapping("showStorrage/getAll")
    public List<Article> findAll(){
        return articleService.findAll();
    }
}
