package de.dhbw.myvitality.services;

import de.dhbw.myvitality.repositories.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * Anwendungslogik für Positionen inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class PositionService {

    @Autowired
    private PositionRepository positionRepository;
}
