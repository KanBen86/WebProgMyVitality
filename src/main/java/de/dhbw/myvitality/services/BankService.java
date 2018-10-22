package de.dhbw.myvitality.services;

import de.dhbw.myvitality.repositories.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * Anwendungslogik für Banken inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class BankService {

    @Autowired
    private BankRepository bankRepository;
}
