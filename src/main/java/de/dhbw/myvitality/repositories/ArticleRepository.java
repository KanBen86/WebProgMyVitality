package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Article;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.Optional;

/**
 * @author Benjamin Kanzler
 */
public interface ArticleRepository extends CrudRepository<Article, String> {

    /**
     * @author Tamino Fischer
     * @param description
     * @return
     */
    @Query("select a from Article a where a.description = :description")
    public Optional<Article> findByQuery(@Param("description") String description);

    /**
     * Dieser Methodenrumpf definiert die Suche nach einem bestimmten Artikel anhand seiner ID
     * @author Benjamin Kanzler
     */
    @Query("SELECT a FROM Article a WHERE a.articleId = :id")
    public Optional<Article> findById(@Param("id") String id);
}
