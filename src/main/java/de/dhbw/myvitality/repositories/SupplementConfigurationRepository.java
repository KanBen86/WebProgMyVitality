package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.SupplementConfiguration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.Optional;

public interface SupplementConfigurationRepository extends CrudRepository<SupplementConfiguration, String> {
/*
    @Query("SELECT s from SupplementConfiguration s where s.articleList = :list")
    public Optional<SupplementConfiguration> findByQuery(@Param("list")ArrayList<SupplementConfiguration> list);*/

}
