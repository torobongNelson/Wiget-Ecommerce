package com.wiget.Wiget.Repositories;
import com.wiget.Wiget.Models.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository extends MongoRepository<Inventory, String> {
}
