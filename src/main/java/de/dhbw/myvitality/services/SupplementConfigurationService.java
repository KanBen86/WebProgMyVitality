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

    //Find All
    public ArrayList<SupplementConfiguration> findAll(){
        ArrayList<SupplementConfiguration> list = new ArrayList<SupplementConfiguration>();
        supplementConfigurationRepository.findAll().forEach(list::add);
        return list;
    }

    //Find Article List By a customerId
    public ArrayList<Article> findArticleListByCustomerId(String customerId){
        ArrayList<Article> list = new ArrayList<Article>();
        for  (Article l: supplementConfigurationRepository.findByQuery(customerId).get().getArticleList()) {
            list.add(l);
        }
        return list;
    }

    public SupplementConfiguration findSupplementConfigurationByUsername(String username){
        Customer customer = customerService.findCustomerByUsername(username);
        logger.info(customer.toString());
        logger.info(supplementConfigurationRepository.findByQuery(customer.getCustomerId()).get().toString());
        return supplementConfigurationRepository.findByQuery(customer.getCustomerId()).get();

        /*ArrayList<Article> list = new ArrayList<Article>();
        list.add(articleRepository.findByQuery("Salz").get());
        list.add(articleRepository.findByQuery("Protein").get());
        list.add(articleRepository.findByQuery("Kreatin").get());
        list.add(articleRepository.findByQuery("Fischöl").get());
        list.add(articleRepository.findByQuery("Testo").get());

        ArrayList<Double> quantityList = new ArrayList<>();
        quantityList.add(1.0);
        quantityList.add(1.0);
        quantityList.add(1.0);
        quantityList.add(1.0);
        quantityList.add(1.0);
        ArrayList<String> informationList = new ArrayList<>();
        informationList.add("s");
        informationList.add("s");
        informationList.add("s");
        informationList.add("s");
        informationList.add("s");
        SupplementConfiguration supplementConfiguration =new SupplementConfiguration(list,quantityList,informationList ,"11111");
        logger.info(String.valueOf(supplementConfiguration.getInformationList().size()));
        return supplementConfiguration;*/


    }

}
