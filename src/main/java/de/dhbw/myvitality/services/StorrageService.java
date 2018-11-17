package de.dhbw.myvitality.services;

import de.dhbw.myvitality.entities.Storrage;
import de.dhbw.myvitality.repositories.ArticleRepository;
import de.dhbw.myvitality.repositories.StorrageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/***
 * Anwendungslogik für Lager inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class StorrageService {

    @Autowired
    private StorrageRepository storrageRepository;

    public List<Storrage> findAll(){
        List<Storrage> storrageList = new ArrayList<>();
        for (Storrage storrage : storrageRepository.findAll()){
            storrageList.add(storrage);
        }
        return storrageList;
    }

    public Storrage findById(String id){
        return storrageRepository.findById(id).get();
    }

    public void save(Storrage storrage) {
        storrageRepository.save(storrage);
    }
}
