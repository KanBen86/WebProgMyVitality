package de.dhbw.myvitality.services;

import de.dhbw.myvitality.entities.Customer;
import de.dhbw.myvitality.entities.FitnessLevel;
import de.dhbw.myvitality.repositories.CustomerRepository;
import de.dhbw.myvitality.repositories.FitnessLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * Anwendungslogik für Fitnesslevel inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class FitneslevelService {

    @Autowired
    private FitnessLevelRepository fitnessLevelRepository;

    @Autowired
    private CustomerRepository customerRepository;

    /**
     * Liefert ein Fitnesslevel anhand der ID
     *
     * @param id
     * @return
     * @author Fabian Lieb
     */
    public FitnessLevel findFitnessleById(String id) {
        return fitnessLevelRepository.findById(id).get();
    }

    /**
     * Diese Methode speichert einen Customer in die Datenbank
     * @param fitnesslevel
     * @author Fabian Lieb
     */
    public void saveFitnessLevel(FitnessLevel fitnesslevel) {
        fitnessLevelRepository.save(fitnesslevel);
    }

    /**
     * Diese Methode liefert zum angemeldeten Username das passende Fitnesslevel
     * @param username
     * @return fitnesslevel
     * @author Fabian Lieb
     */
    public FitnessLevel findFitnessLevelByUsername(String username) {
        FitnessLevel fitnesslevel = customerRepository.findCustomerByQuery(username).get().getFitnessLevel();
        if(fitnesslevel!=null)return fitnesslevel;
        return new FitnessLevel();
    }
}
