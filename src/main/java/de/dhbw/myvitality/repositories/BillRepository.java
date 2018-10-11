package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Bill;
import org.springframework.data.repository.CrudRepository;

public interface BillRepository extends CrudRepository<Bill, String> {
}
