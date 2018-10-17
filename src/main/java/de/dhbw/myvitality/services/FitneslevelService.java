package de.dhbw.myvitality.services;

import de.dhbw.myvitality.repositories.FitnessLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FitneslevelService {

    @Autowired
    private FitnessLevelRepository fitnessLevelRepository;
}
