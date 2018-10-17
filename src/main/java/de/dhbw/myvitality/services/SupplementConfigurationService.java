package de.dhbw.myvitality.services;

import de.dhbw.myvitality.repositories.SupplementConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplementConfigurationService {

    @Autowired
    private SupplementConfigurationRepository supplementConfigurationRepository;
}
