package com.wiget.Wiget.Interfaces;

import com.wiget.Wiget.Models.Product;
import com.wiget.Wiget.Models.ProductCategory;

import java.util.List;

public interface ProductCategoryInterface {
    List<ProductCategory> viewProductCategories();
    ProductCategory getProductCategory(String id);
    ProductCategory addProductCategory(ProductCategory productCat);
    ProductCategory updateProductCategory(ProductCategory productCat);
    void removeProductCategory(String id);
}
