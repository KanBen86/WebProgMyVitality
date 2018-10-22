package de.dhbw.myvitality.services;

import de.dhbw.myvitality.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * Anwendungslogik für Rechnungen inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class BillService {

    @Autowired
    private BillRepository billRepository;
}
