package de.dhbw.myvitality.services;

import de.dhbw.myvitality.entities.Employee;
import de.dhbw.myvitality.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * Anwendungslogik für Mitarbeiter inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class EmployeeService {

    //CRUD Repository, welches den DB-Zufriff regelt
    @Autowired
    public EmployeeRepository employeeRepository;

    //Sucht einen Mitarbeiter in der Datenbank und gibt ihn als Instanz einer Entityklasse zurück
    public Employee findEmployeeByUsername(String username){
        try {
            return employeeRepository.findEmployeeByQuery(username).get();
        }catch (Exception ex){
            return null;
        }
    }

}
