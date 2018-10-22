package de.dhbw.myvitality.services;

import de.dhbw.myvitality.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * Anwendungslogik für Artikel inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;
}
