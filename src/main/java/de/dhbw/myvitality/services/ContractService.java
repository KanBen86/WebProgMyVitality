package de.dhbw.myvitality.services;

import de.dhbw.myvitality.repositories.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * Anwendungslogik für Verträge inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class ContractService {

    @Autowired
    private ContractRepository contractRepository;
}
