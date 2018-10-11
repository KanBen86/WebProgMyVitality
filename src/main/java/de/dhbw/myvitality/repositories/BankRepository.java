package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Bank;
import org.springframework.data.repository.CrudRepository;

public interface BankRepository extends CrudRepository<Bank, String> {
}
