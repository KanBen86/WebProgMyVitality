package de.dhbw.myvitality.services;

import de.dhbw.myvitality.entities.Customer;
import de.dhbw.myvitality.entities.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
/***
 * Anwendungslogik für die Userauthentifikation inkl. Datenbankzugriff per Repository
 * @author Tamino Fischer alias CodeKeks
 */
@Service
public class UserAuthentificationService {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CustomerService customerService;

    private static final Logger log = LoggerFactory.getLogger(UserAuthentificationService.class);


    /**
     *
     * Dieser Service dient dem Absoeichern der Logindaten in der aktuellen HTTP-Session.
     * Das dafür verwendete boolean Array und dessen Belegung wird im folgenden Kommentarschrift aufgefüht-
     *
     * @param httpSession
     * @return
     *
     * @author Sven Hornung
     */

    /**
     * [0] == true -> Authentifikation erfolgreich
     * [0] == false -> Authentifikation nicht erfolgreich
     * [1] == true -> Customer
     * [1] == false -> Employee
     */

    public boolean[] userAuthentification(HttpSession httpSession){
        log.info("Starte Authentifizierung");
        log.info("----------------------------");
        String username = httpSession.getAttribute("username").toString();
        String password = httpSession.getAttribute("password").toString();
        Customer customer = customerService.findCustomerByUsername(username);
        Employee employee = employeeService.findEmployeeByUsername(username);
        log.info("Eingegebener Username: " + username);
        log.info("Eingegebenes Passwort: " + password);


        boolean[] list = new boolean[2];

        if (customer != null){
            log.info("Gefundener Kunde: " + customer.toString());
            if (customer.getPassword().equals(password)){

                list[0] = true;
                list[1] = true;
            }
            else {
                list[0] = false;
                list[1] = true;
            }
        }
        else if (employee != null){
            log.info("Gefundener Mitarbeiter: " + employee.toString());
            if (employee.getPassword().equals(password)){
                list[0] = true;
                list[1] = false;
            }
            else {
                list[0] = false;
                list[1] = false;
            }
        }
        log.info(list.toString());
        return list;
    }
}
