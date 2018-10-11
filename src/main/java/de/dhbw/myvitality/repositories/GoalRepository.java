package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Goal;
import org.springframework.data.repository.CrudRepository;

public interface GoalRepository extends CrudRepository<Goal, String> {
}
