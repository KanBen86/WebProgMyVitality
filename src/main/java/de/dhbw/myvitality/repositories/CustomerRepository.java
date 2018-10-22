package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Customer;
import de.dhbw.myvitality.entities.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, String> {

    /**
     *
     * Abfrage der Übereinstimmung vom übergebenen und in der Datenbank "Customer" vorhandenen Nutzernamen.
     *
     * @param username
     * @return
     *
     * @author Sven Hornung
     */

    @Query("select c from Customer c Where c.username = :username")
    public Optional<Customer> findCustomerByQuery(@Param("username") String username);
}
