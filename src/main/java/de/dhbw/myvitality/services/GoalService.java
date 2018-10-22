package de.dhbw.myvitality.services;

import de.dhbw.myvitality.repositories.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * Anwendungslogik für Ziele inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class GoalService {

    @Autowired
    private GoalRepository goalRepository;
}
