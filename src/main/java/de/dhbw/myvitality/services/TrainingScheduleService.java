package de.dhbw.myvitality.services;

import de.dhbw.myvitality.entities.Customer;
import de.dhbw.myvitality.entities.TrainingSchedule;
import de.dhbw.myvitality.repositories.TrainingScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/***
 * Anwendungslogik für Trainingsziele inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class TrainingScheduleService {

    @Autowired
    private TrainingScheduleRepository trainingScheduleRepository;

    // Alle Übungen suchen
    public List<TrainingSchedule> findAll() {
        List<TrainingSchedule> trainingScheduleList = new ArrayList<>();
        for (TrainingSchedule trainingSchedule: trainingScheduleRepository.findAll()){
            trainingScheduleList.add(trainingSchedule);
        }
        return trainingScheduleList;
    }

    public void save(TrainingSchedule schedule) {
        trainingScheduleRepository.save(schedule);
    }

    public Iterable<TrainingSchedule> findByCustomer(Customer customer) {
        return trainingScheduleRepository.findbyCustomer(customer);
    }
}
