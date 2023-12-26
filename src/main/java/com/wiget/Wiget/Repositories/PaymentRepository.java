package com.wiget.Wiget.Repositories;

import com.wiget.Wiget.Models.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment,String> {
}
