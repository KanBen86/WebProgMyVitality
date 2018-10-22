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

    @Autowired
    public EmployeeRepository employeeRepository;

    /**
     *
     * Mit dem EmployeeRepository als Datenbankschnittstelle den Nuternamen eines Mitarbeiters  abfragen und mit return zurückgeben
     *
     * @param username
     * @return
     *
     * @author Sven Hornung
     */

    public Employee findEmployeeByUsername(String username){
        try {
            return employeeRepository.findEmployeeByQuery(username).get();
        }catch (Exception ex){
            return null;
        }
    }

}
