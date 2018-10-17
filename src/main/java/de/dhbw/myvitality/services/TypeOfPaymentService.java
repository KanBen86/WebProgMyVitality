package de.dhbw.myvitality.services;

import de.dhbw.myvitality.repositories.TypeOfPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeOfPaymentService {

    @Autowired
    private TypeOfPaymentRepository typeOfPaymentRepository;
}
