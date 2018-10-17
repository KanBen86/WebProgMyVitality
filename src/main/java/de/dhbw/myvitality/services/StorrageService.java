package de.dhbw.myvitality.services;

import de.dhbw.myvitality.repositories.StorrageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorrageService {

    @Autowired
    private StorrageRepository storrageRepository;
}
