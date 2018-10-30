package de.dhbw.myvitality.services;

import de.dhbw.myvitality.entities.Article;
import de.dhbw.myvitality.entities.Customer;
import de.dhbw.myvitality.entities.SupplementConfiguration;
import de.dhbw.myvitality.repositories.ArticleRepository;
import de.dhbw.myvitality.repositories.SupplementConfigurationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/***
 * Anwendungslogik für die individuelle Nahrungsergänzungsmittelkonfiguration inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class SupplementConfigurationService {

    @Autowired
    private SupplementConfigurationRepository supplementConfigurationRepository;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ArticleRepository articleRepository;

    private static final Logger logger = LoggerFactory.getLogger(SupplementConfigurationService.class);

    public SupplementConfiguration findSupplementConfigurationByUsername(String username){
        Customer customer = customerService.findCustomerByUsername(username);
        logger.info(customer.toString());
        logger.info(supplementConfigurationRepository.findByQuery(customer.getCustomerId()).get().toString());
        return supplementConfigurationRepository.findByQuery(customer.getCustomerId()).get();
    }

    public SupplementConfiguration findSupplementConfigurationByUserId(String id){
        return supplementConfigurationRepository.findByQuery(id).get();
    }

}
