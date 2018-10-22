package de.dhbw.myvitality.services;

import de.dhbw.myvitality.repositories.TypeOfPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * Anwendungslogik für Zahlungstyp inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class TypeOfPaymentService {

    @Autowired
    private TypeOfPaymentRepository typeOfPaymentRepository;
}
