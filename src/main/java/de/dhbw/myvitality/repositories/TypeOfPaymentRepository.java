package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.TypeOfPayment;
import org.springframework.data.repository.CrudRepository;

public interface TypeOfPaymentRepository extends CrudRepository<TypeOfPayment, String> {
}
