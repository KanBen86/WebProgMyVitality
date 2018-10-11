package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Ordering;
import org.springframework.data.repository.CrudRepository;

public interface OrderingRepository extends CrudRepository<Ordering, String> {
}
