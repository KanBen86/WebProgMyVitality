package de.dhbw.myvitality.services;

import de.dhbw.myvitality.repositories.TrainingScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * Anwendungslogik für Trainingsziele inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class TrainingScheduleService {

    @Autowired
    private TrainingScheduleRepository trainingScheduleRepository;
}
