package de.dhbw.myvitality.services;

import de.dhbw.myvitality.repositories.TrainingScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainingScheduleService {

    @Autowired
    private TrainingScheduleRepository trainingScheduleRepository;
}
