package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Article;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ArticleRepository extends CrudRepository<Article, String> {

    @Query("select a from Article a where a.description = :description")
    public Optional<Article> findByQuery(@Param("description") String description);
}
