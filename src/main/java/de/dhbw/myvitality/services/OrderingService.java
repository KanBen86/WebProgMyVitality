package de.dhbw.myvitality.services;

import de.dhbw.myvitality.repositories.OrderingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderingService {

    @Autowired
    private OrderingRepository orderingRepository;
}
