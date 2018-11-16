package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Storrage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/***
 * CRUD Repository
 * @author Tamino Fischer alias CodeKeks
 */
public interface StorrageRepository extends CrudRepository<Storrage, String> {

}
