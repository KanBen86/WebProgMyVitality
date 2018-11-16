package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Company;
import org.springframework.data.repository.CrudRepository;

/***
 * CRUD Repository + eigene Query
 * @author Tamino Fischer alias CodeKeks
 */
public interface CompanyRepository extends CrudRepository<Company, String> {
}
