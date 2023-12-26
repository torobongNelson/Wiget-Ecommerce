package com.wiget.Wiget.Interfaces;

import com.wiget.Wiget.Models.Product;
import com.wiget.Wiget.Models.ProductCategory;

import java.util.List;

public interface ProductServiceInterface {

    List<Product> viewAllProducts();
    Product getProduct(String id);
    Product addProduct(Product product);
    Product updateProduct(Product product);
    void removeProduct(String id);



}
