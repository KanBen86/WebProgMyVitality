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
        if(customer.getFitnessLevel()==null) customer.setFitnessLevel(new FitnessLevel());
        FitnessLevel fitnessLevel = customer.getFitnessLevel();
            return fitnessLevel;
    }

    /**
     * Diese Methode editiert das FitnessLevel eines Kunden
     * @author Fabian Lieb
     */
    @RequestMapping(method = RequestMethod.POST, value = "/savePreexerciselevel/{username}")
    public void editFitnessLevel(@RequestBody FitnessLevel fitnessLevel, @PathVariable("username") String username ){
        log.info("------------------");
        log.info("Serveraufruf Fitnesslevel via ReST");
        log.info(""+fitnessLevel);
        Customer customer = customerService.findCustomerByUsername(username);
        FitnessLevel oldFitnessLevel = customer.getFitnessLevel();
        if(oldFitnessLevel==null){
            log.info("Neues Fitnesslevel wird angelegt");
            oldFitnessLevel=fitnessLevel;
            log.info("Altes Fitnesslevel"+oldFitnessLevel);
            log.info("Altes Fitnesslevel speichern");
            fitneslevelService.saveFitnessLevel(oldFitnessLevel);
            customer.setFitnessLevel(oldFitnessLevel);
            customerService.saveCustomer(customer);
            return;
        }
        else {
            if (fitnessLevel.getSex() != null) {
                if (fitnessLevel.getSex() != oldFitnessLevel.getSex()) oldFitnessLevel.setSex(fitnessLevel.getSex());
            }
            if (fitnessLevel.getWeight() != null) {
                if (fitnessLevel.getWeight() != oldFitnessLevel.getWeight()) oldFitnessLevel.setWeight(fitnessLevel.getWeight());
            }
            if (fitnessLevel.getHeight() != null) {
                if (fitnessLevel.getHeight() != oldFitnessLevel.getHeight()) oldFitnessLevel.setHeight(fitnessLevel.getHeight());
            }
            if (fitnessLevel.getExperience() != null) {
                if (fitnessLevel.getExperience() != oldFitnessLevel.getExperience()) oldFitnessLevel.setExperience(fitnessLevel.getExperience());
            }
            if (fitnessLevel.getJob() != null) {
                if (fitnessLevel.getJob() != oldFitnessLevel.getJob()) oldFitnessLevel.setJob(fitnessLevel.getJob());
            }
            if (fitnessLevel.getArm() != null) {
                if (fitnessLevel.getArm() != oldFitnessLevel.getArm()) oldFitnessLevel.setArm(fitnessLevel.getArm());
            }
            if (fitnessLevel.getChest() != null) {
                if (fitnessLevel.getChest() != oldFitnessLevel.getChest()) oldFitnessLevel.setChest(fitnessLevel.getChest());
            }
            if (fitnessLevel.getStomach() != null) {
                if (fitnessLevel.getStomach() != oldFitnessLevel.getStomach()) oldFitnessLevel.setStomach(fitnessLevel.getStomach());
            }
            if (fitnessLevel.getWaist() != null) {
                if (fitnessLevel.getWaist() != oldFitnessLevel.getWaist()) oldFitnessLevel.setWaist(fitnessLevel.getWaist());
            }
            if (fitnessLevel.getThigh() != null) {
                if (fitnessLevel.getThigh() != oldFitnessLevel.getThigh()) oldFitnessLevel.setThigh(fitnessLevel.getThigh());
            }
            if (fitnessLevel.getCalf() != null) {
                if (fitnessLevel.getCalf() != oldFitnessLevel.getCalf()) oldFitnessLevel.setCalf(fitnessLevel.getCalf());
            }
            if (fitnessLevel.getFoodIntolerance() != null) {
                if (fitnessLevel.getFoodIntolerance() != oldFitnessLevel.getFoodIntolerance()) oldFitnessLevel.setFoodIntolerance(fitnessLevel.getFoodIntolerance());
            }
            if (fitnessLevel.getInjury() != null) {
                if (fitnessLevel.getInjury() != oldFitnessLevel.getInjury()) oldFitnessLevel.setInjury(fitnessLevel.getInjury());
            }
            if (fitnessLevel.getMedicine() != null) {
                if (fitnessLevel.getMedicine() != oldFitnessLevel.getMedicine()) oldFitnessLevel.setMedicine(fitnessLevel.getMedicine());
            }

        }
        //Neues FitnessLevel speichern
        log.info("Fitnesslevel"+oldFitnessLevel);
        fitneslevelService.saveFitnessLevel(oldFitnessLevel);

    }
}
