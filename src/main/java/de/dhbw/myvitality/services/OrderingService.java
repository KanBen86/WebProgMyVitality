package de.dhbw.myvitality.services;

import de.dhbw.myvitality.repositories.OrderingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * Anwendungslogik für Aufträge inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class OrderingService {

    @Autowired
    private OrderingRepository orderingRepository;
}
