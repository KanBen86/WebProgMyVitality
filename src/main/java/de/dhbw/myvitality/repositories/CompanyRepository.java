package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, String> {
}
