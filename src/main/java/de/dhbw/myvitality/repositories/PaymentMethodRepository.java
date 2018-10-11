package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.PaymentMethod;
import org.springframework.data.repository.CrudRepository;

public interface PaymentMethodRepository extends CrudRepository<PaymentMethod, String> {
}
