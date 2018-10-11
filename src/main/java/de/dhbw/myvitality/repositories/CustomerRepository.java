package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {
}
