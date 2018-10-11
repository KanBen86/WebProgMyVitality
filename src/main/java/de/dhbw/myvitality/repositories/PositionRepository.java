package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Position;
import org.springframework.data.repository.CrudRepository;

public interface PositionRepository extends CrudRepository<Position, String> {
}
