package de.dhbw.myvitality.services;

import de.dhbw.myvitality.repositories.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * Anwendungslogik für Adressen inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class AdressService {

    @Autowired
    private AdressRepository adressRepository;
}
