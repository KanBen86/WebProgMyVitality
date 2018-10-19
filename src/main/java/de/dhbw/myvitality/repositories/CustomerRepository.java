package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Customer;
import de.dhbw.myvitality.entities.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, String> {

    @Query("select c from Customer c Where c.username = :username")
    public Optional<Customer> findCustomerByQuery(@Param("username") String username);
}
