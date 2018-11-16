package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.FitnessLevel;
import org.springframework.data.repository.CrudRepository;

/***
 * CRUD Repository + eigene Query
 * @author Tamino Fischer alias CodeKeks
 */
public interface FitnessLevelRepository extends CrudRepository<FitnessLevel, String> {
}
