package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Article;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

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
}
