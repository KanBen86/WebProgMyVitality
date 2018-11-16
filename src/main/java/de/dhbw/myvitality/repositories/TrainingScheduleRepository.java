package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Customer;
import de.dhbw.myvitality.entities.TrainingSchedule;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface TrainingScheduleRepository extends CrudRepository<TrainingSchedule, String> {

    /***
     * CRUD Repository + eigene Query
     * @author Moritz Lang
     */
    @Query("select t from TrainingSchedule t where t.customer = :customer")
    public Iterable<TrainingSchedule> findbyCustomer(@Param("customer") Customer customer);
}
