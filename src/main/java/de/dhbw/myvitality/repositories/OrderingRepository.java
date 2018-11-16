package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Ordering;
import org.springframework.data.repository.CrudRepository;

/***
 * CRUD Repository
 * @author Tamino Fischer alias CodeKeks
 */
public interface OrderingRepository extends CrudRepository<Ordering, String> {
}
