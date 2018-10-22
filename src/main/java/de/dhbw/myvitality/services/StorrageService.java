package de.dhbw.myvitality.services;

import de.dhbw.myvitality.repositories.StorrageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * Anwendungslogik für Lager inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class StorrageService {

    @Autowired
    private StorrageRepository storrageRepository;
}
