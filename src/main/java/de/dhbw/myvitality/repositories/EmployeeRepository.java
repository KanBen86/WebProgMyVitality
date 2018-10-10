package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

}
