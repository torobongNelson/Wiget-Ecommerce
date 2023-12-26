package com.wiget.Wiget.Repositories;

import com.wiget.Wiget.Models.Payment;
import com.wiget.Wiget.Models.PaymentType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentTypeRepository extends MongoRepository<PaymentType, String> {
}
