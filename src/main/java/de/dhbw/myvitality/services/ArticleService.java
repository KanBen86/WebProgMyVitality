package de.dhbw.myvitality.services;

import de.dhbw.myvitality.entities.Article;
import de.dhbw.myvitality.repositories.ArticleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Anwendungslogik für Artikel inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class ArticleService {

    private final static Logger LOG = LoggerFactory.getLogger(ArticleService.class);
    @Autowired
    private ArticleRepository articleRepository;


    public Optional<Article> findById(String id) {
        return articleRepository.findById(id);
    }

    public void save(Article article) {

        articleRepository.save(article);
        LOG.info("Artikel persistiert: " + article);
    }

    public List<Article> findAll(){
        List<Article> articleList = new ArrayList<>();
        for (Article article : articleRepository.findAll()){
            articleList.add(article);
        }
        return articleList;
    }
}
