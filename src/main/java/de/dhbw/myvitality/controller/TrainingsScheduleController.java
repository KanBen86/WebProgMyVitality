package de.dhbw.myvitality.controller;

import de.dhbw.myvitality.entities.Customer;
import de.dhbw.myvitality.entities.TrainingSchedule;
import de.dhbw.myvitality.services.CustomerService;
import de.dhbw.myvitality.services.TrainingScheduleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/***
 * Mappt die Http Anfragen auf eine Serviceinstanz
 * @author Tamino Fischer alias CodeKeks
 */
@RestController
public class TrainingsScheduleController {

    private final static Logger logger = LoggerFactory.getLogger(TrainingsScheduleController.class);
    @Autowired
    private TrainingScheduleService trainingScheduleService;
    @Autowired
    private CustomerService customerService;

    /**
     * Http Request vom Typ Post, bekommt einen Trainingsplan übergeben
     * @author Moritz Kuttler
     */
    @RequestMapping(method = RequestMethod.POST, value = "/saveSchedule/{username}")
    public void setCustomerTrainingsschedule(@RequestBody TrainingSchedule schedule, @PathVariable("username") String username){
        logger.info("Methodenaufruf hat funktioniert! Übergebener User:" + username);
        Customer customer = customerService.findCustomerByUsername(username);
        schedule.setCustomer(customer);
        trainingScheduleService.save(schedule);
    }

    @RequestMapping("/getSchedules")
    public List<TrainingSchedule> getTrainingsSchedule () {
        return trainingScheduleService.findAll();

    }

    @RequestMapping("/getScheduleById/{customerId}")
    public Iterable<TrainingSchedule> getTrainingsScheduleByCustomerId(@PathVariable("customerId") String customerId){
        Customer customer = customerService.findCustomerById(customerId);
        return trainingScheduleService.findByCustomer(customer);
    }

}
