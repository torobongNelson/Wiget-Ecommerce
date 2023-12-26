package com.wiget.Wiget.Repositories;

import com.wiget.Wiget.Models.Orders;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Orders, String> {
}
