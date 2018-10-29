package de.dhbw.myvitality.controller;

import de.dhbw.myvitality.entities.Customer;
import de.dhbw.myvitality.entities.TrainingSchedule;
import de.dhbw.myvitality.services.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/***
 * Mappt die Http Anfragen auf eine Serviceinstanz
 * @author Tamino Fischer alias CodeKeks
 */
@RestController
public class CustomerController {
    private final static Logger log= LoggerFactory.getLogger(CustomerController.class);


    @Autowired
    public CustomerService customerService;


    // Bei einem http-Request getCustomer wird der gesuchte Customer als JSON-Datensatz zurückgegeben
    @RequestMapping("/customer/{username}")
    public Customer getCustomerByUsername(@PathVariable("username") String username){
        return customerService.findCustomerByUsername(username);
    }

    /**
     * Diese Methode holt via Http-Request einen Costumer zur übertragenden Id aus der Datenbank und liefert ihn an den Browser zurück
     * @author Fabian Lieb
     */
    @RequestMapping("/customerProfile/{customerID}")
    public Customer getCustomerById(@PathVariable("customerID") String id){
        return customerService.findCustomerById(id);
    }

    /**
     * Diese Methode editiert das Benutzerprofil eines Kunden
     * @author Fabian Lieb
     */
    @RequestMapping(method = RequestMethod.POST, value = "/profileSettings")
    public void editCustomerProfileSettings(@RequestBody Customer customer){
        //Alten Datensatz zum Kunden aus Datenbank auslesen
        log.info("VorhandenenDatensatzAusDatenbankLesen");
        Customer oldCustomer=customerService.findCustomerById(customer.getCustomerId());
        log.info(oldCustomer.toString());
        //Felder des neuen Customers auf Befüllung prüfen
        //Falls befüllt überprüfen welche sich verändert haben
        if(customer.getFirstname()!=null) {
            if(customer.getFirstname()!=oldCustomer.getFirstname())oldCustomer.setFirstname(customer.getFirstname());
        }
        if(customer.getLastname()!=null) {
            if(customer.getLastname()!=oldCustomer.getLastname())oldCustomer.setLastname(customer.getLastname());
        }
        if(customer.getAdress()!=null);
        if(customer.getAccounts()!=null);
        if(customer.getDateOfBirth()!=null) {
            if(customer.getDateOfBirth()!=oldCustomer.getDateOfBirth())oldCustomer.setDateOfBirth(customer.getDateOfBirth());
        }
        if(customer.getEmailAddress()!=null) {
            if(customer.getEmailAddress()!=oldCustomer.getEmailAddress())oldCustomer.setEmailAddress(customer.getEmailAddress());
        }
        if(customer.getPassword()!=null);
        if(customer.getPhoneNo()!=null);
        if(customer.getSex()!=null);
        if(customer.getUsername()!=null);
        if(customer.getBillAdress()!=null);
        if(customer.getDelivieryAddress()!=null);
        if(customer.getFitnessLevel()!=null);
        if(customer.getGoal()!=null);
        if(customer.getPreferredTypeOfPayment()!=null);

        //Neuen Customer speichern
        customerService.saveCustomer(oldCustomer);
    }
}
