package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, String> {
}
