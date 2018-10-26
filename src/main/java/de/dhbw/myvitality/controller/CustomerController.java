package de.dhbw.myvitality.controller;

import de.dhbw.myvitality.entities.Customer;
import de.dhbw.myvitality.entities.TrainingSchedule;
import de.dhbw.myvitality.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/***
 * Mappt die Http Anfragen auf eine Serviceinstanz
 * @author Tamino Fischer alias CodeKeks
 */
@RestController
public class CustomerController {


    @Autowired
    public CustomerService customerService;


    // Bei einem http-Request getCustomer wird der gesuchte Customer als JSON-Datensatz zurückgegeben
    @RequestMapping("/customer/{username}")
    public Customer getCustomerByUsername(@PathVariable("username") String username){
        return customerService.findCustomerByUsername(username);
    }

    // Bei einem http-Request post mit username und trainingsliste wird die Trainingsliste beim entsprechenden User gespeichert
    @RequestMapping(method = RequestMethod.POST, value = "/customer")
    public void setCustomerTrainingsschedule(@RequestBody Customer customer){
        ArrayList<TrainingSchedule> list = new ArrayList<TrainingSchedule>(customer.getTrainingSchedules());
        customerService.saveTrainingsScheduleList(customer.getUsername(), list);
    }
}
