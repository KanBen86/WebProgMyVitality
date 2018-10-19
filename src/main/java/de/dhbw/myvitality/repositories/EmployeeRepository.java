package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Adress;
import de.dhbw.myvitality.entities.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

    @Query("select e from Employee e Where e.username = :username")
    public Optional<Employee> findEmployeeByQuery(@Param("username") String username);
}
