package de.dhbw.myvitality.controller;

import de.dhbw.myvitality.entities.Article;
import de.dhbw.myvitality.entities.SupplementConfiguration;
import de.dhbw.myvitality.services.SupplementConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/***
 * Mappt die Http Anfragen auf eine Serviceinstanz
 * @author Tamino Fischer alias CodeKeks
 */
@RestController
public class SupplementConfigurationController {

    //CURD Repository, welches den DB-Zugriff regelt
    @Autowired
    private SupplementConfigurationService supplementConfigurationService;

    //Wird eine Http GET Anfrage an diese URL gestellt, so wird eine Liste von Artikeln zurückgegeben
    //Die Liste wird über die entsprechende Custimer Id gefunden
    @RequestMapping("/supplementconfiguration/{customerId}")
    public SupplementConfiguration findArticleListByCustomerId(@PathVariable("customerId") String customerId){
        return supplementConfigurationService.findSupplementConfigurationByUserId(customerId);
    }



}
