package de.dhbw.myvitality.services;

import de.dhbw.myvitality.entities.Customer;
import de.dhbw.myvitality.entities.TrainingSchedule;
import de.dhbw.myvitality.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/***
 * Anwendungslogik für Kunden inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class CustomerService {

    //CRUD Repository, welches den DB-Zufriff regelt
    @Autowired
    public CustomerRepository customerRepository;

    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);

    // Sucht einen Kunden in der Datenbank und gibt ihn als Instanz einer Entityklasse zurück
    public Customer findCustomerByUsername(String username){
        try {
            return customerRepository.findCustomerByQuery(username).get();
        }catch (Exception ex){
            return null;
        }
    }

    //Wenn Username noch nicht vergeben -> Neuen Customer in der DB speichern und true zurückgeben
    //Wenn USername schon vergeben false zurückgeben
    public boolean registerCustomer(String username, String password, String email){
        Customer customer = findCustomerByUsername(username);
        if (customer == null){
            log.info("Username noch nicht vergeben -> User anlegen");
            log.info("-------------------------------");
            customer = new Customer("11111", null, null, null, null, "Banküberweisung");
            customer.setUsername(username);
            customer.setPassword(password);
            customer.setEmailAddress(email);
            customerRepository.save(customer);
            log.info("Neuer User angelegt");
            log.info("Username:    " +username);
            log.info("Password:    " +password);
            log.info("EmailAdress: " +email);
            return true;
        }
        else{
            log.info("Username ex. bereits");
            return false;
        }
    }

    // Sucht einen Kunden in der Datenbank und liefert true oder false zurück
    public boolean checkExistingCustomerByUsername(String username){
        try {
            customerRepository.findCustomerByQuery(username).get();
            log.info("Kunde gefunden");
            return true;
        }catch (Exception ex){
            log.info("Kunde nicht gefunden");
            return false;
        }
    }

    /**
     * Liefert einen Customer anhand seiner ID
     *
     * @param id
     * @return
     * @author Fabian Lieb
     */
    public Customer findCustomerById(String id) {
        return customerRepository.findById(id).get();
    }

    /**
     * Diese Methode speichert einen Customer in die Datenbank
     * @param customer
     * @author Fabian Lieb
     */
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}
