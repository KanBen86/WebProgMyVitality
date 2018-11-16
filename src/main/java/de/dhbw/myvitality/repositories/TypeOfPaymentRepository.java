package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.TypeOfPayment;
import org.springframework.data.repository.CrudRepository;

/***
 * CRUD Repository
 * @author Tamino Fischer alias CodeKeks
 */
public interface TypeOfPaymentRepository extends CrudRepository<TypeOfPayment, String> {
}
