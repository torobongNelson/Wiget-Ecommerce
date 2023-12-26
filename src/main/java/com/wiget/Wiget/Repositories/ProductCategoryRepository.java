package com.wiget.Wiget.Repositories;

import com.wiget.Wiget.Models.Product;
import com.wiget.Wiget.Models.ProductCategory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends MongoRepository<ProductCategory, String> {
}
