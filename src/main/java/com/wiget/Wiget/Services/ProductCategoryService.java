package com.wiget.Wiget.Services;

import Exceptions.ProductCategoryExceptions.ProductCategoryNotFoundException;
import com.wiget.Wiget.Interfaces.ProductCategoryInterface;
import com.wiget.Wiget.Models.ProductCategory;
import com.wiget.Wiget.Repositories.ProductCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryService implements ProductCategoryInterface {
    private final ProductCategoryRepository productCategoryRepository;

    public ProductCategoryService(ProductCategoryRepository productCategoryRepository){
        this.productCategoryRepository = productCategoryRepository;
    }


    @Override
    public List<ProductCategory> viewProductCategories() {
        return productCategoryRepository.findAll();
    }

    @Override
    public ProductCategory getProductCategory(String id) {
        return productCategoryRepository.findById(id).orElseThrow(() -> new ProductCategoryNotFoundException("The requested product category is not found" ));
    }

    @Override
    public ProductCategory addProductCategory(ProductCategory productCat) {
        return productCategoryRepository.save(productCat);
    }

    @Override
    public ProductCategory updateProductCategory(ProductCategory productCat) {
        return productCategoryRepository.save(productCat);
    }

    @Override
    public void removeProductCategory(String id) {
        productCategoryRepository.deleteById(id);
    }
}
