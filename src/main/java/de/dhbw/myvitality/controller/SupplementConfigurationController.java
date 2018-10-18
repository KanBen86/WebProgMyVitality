package de.dhbw.myvitality.controller;

import de.dhbw.myvitality.entities.Article;
import de.dhbw.myvitality.services.SupplementConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class SupplementConfigurationController {

    @Autowired
    private SupplementConfigurationService supplementConfigurationService;

    @RequestMapping("/supplementconfiguration/{customerId}")
    public ArrayList<Article> findArticleListByCustomerId(@PathVariable("customerId") String customerId){
        return supplementConfigurationService.findArticleListByCustomerId(customerId);
    }
}
