package de.dhbw.myvitality.controller;

import de.dhbw.myvitality.entities.Customer;
import de.dhbw.myvitality.entities.FitnessLevel;
import de.dhbw.myvitality.services.CustomerService;
import de.dhbw.myvitality.services.FitneslevelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/***
 * Mappt die Http Anfragen auf eine Serviceinstanz
 * @author Tamino Fischer alias CodeKeks
 */
@RestController
public class FitnesslevelController {
    private final static Logger log= LoggerFactory.getLogger(FitnesslevelController.class);


    @Autowired
    public FitneslevelService fitneslevelService;

    @Autowired
    public CustomerService customerService;

    // Bei einem http-Request getFitnesslevel wird das gesuchte Fitnesslevel als JSON-Datensatz zurückgegeben
    @RequestMapping("/fitnessLevel/{username}")
    public FitnessLevel getFitnessLevelByUsername(@PathVariable("username") String username){
        log.info("abrufen des Fitnesslevels");
        Customer customer = customerService.findCustomerByUsername(username);

        customer.setFitnessLevel(new FitnessLevel());
        FitnessLevel fitnessLevel = customer.getFitnessLevel();
            return fitnessLevel;
    }

    /**
     * Diese Methode editiert das FitnessLevel eines Kunden
     * @author Fabian Lieb
     */
    @RequestMapping(method = RequestMethod.POST, value = "/preexerciselevel")
    public void editFitnessLevel(@RequestBody FitnessLevel fitnessLevel){

        //Neues FitnessLevel speichern
        fitneslevelService.saveFitnessLevel(fitnessLevel);
    }
}
