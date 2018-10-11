package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.TrainingSchedule;
import org.springframework.data.repository.CrudRepository;

public interface TrainingScheduleRepository extends CrudRepository<TrainingSchedule, String> {
}
