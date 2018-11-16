package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Position;
import org.springframework.data.repository.CrudRepository;

/***
 * CRUD Repository
 * @author Tamino Fischer alias CodeKeks
 */
public interface PositionRepository extends CrudRepository<Position, String> {
}
