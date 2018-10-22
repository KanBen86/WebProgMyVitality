package de.dhbw.myvitality.services;

import de.dhbw.myvitality.entities.Customer;
import de.dhbw.myvitality.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * Anwendungslogik für Kunden inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class CustomerService {

    @Autowired
    public CustomerRepository customerRepository;

    @Autowired
    private CustomerService customerService;

    /**
     *
     * Mit dem CustomerRepository als Datenbankschnittstelle den Nuternamen eines Kunden abfragen und mit return zurückgeben
     *
     * @param username
     * @return
     *
     * @author Sven Hornung
     */

    public Customer findCustomerByUsername(String username){
        try {
            return customerRepository.findCustomerByQuery(username).get();
        }catch (Exception ex){
            return null;
        }
    }

}
