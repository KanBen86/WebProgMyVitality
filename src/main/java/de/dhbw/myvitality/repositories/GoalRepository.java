package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Goal;
import org.springframework.data.repository.CrudRepository;

/***
 * CRUD Repository + eigene Query
 * @author Tamino Fischer alias CodeKeks
 */
public interface GoalRepository extends CrudRepository<Goal, String> {
}
