package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Contract;
import org.springframework.data.repository.CrudRepository;

public interface ContractRepository extends CrudRepository<Contract, String> {
}
