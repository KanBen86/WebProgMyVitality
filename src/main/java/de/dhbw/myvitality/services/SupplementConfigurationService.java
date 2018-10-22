package de.dhbw.myvitality.services;

import de.dhbw.myvitality.entities.Article;
import de.dhbw.myvitality.entities.SupplementConfiguration;
import de.dhbw.myvitality.repositories.SupplementConfigurationRepository;
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
}
