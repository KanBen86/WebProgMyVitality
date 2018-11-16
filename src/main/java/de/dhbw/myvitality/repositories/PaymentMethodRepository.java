package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.PaymentMethod;
import org.springframework.data.repository.CrudRepository;

/***
 * CRUD Repository
 * @author Tamino Fischer alias CodeKeks
 */
public interface PaymentMethodRepository extends CrudRepository<PaymentMethod, String> {
}
