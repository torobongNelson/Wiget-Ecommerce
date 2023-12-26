package com.wiget.Wiget.Services;

import com.wiget.Wiget.Exceptions.ProductCategoryExceptions.ProductCategoryNotFoundException;
import com.wiget.Wiget.Exceptions.ProductExceptions.ProductNotFoundException;
import com.wiget.Wiget.Interfaces.ProductServiceInterface;
import com.wiget.Wiget.Models.Product;
import com.wiget.Wiget.Models.ProductCategory;
import com.wiget.Wiget.Repositories.ProductCategoryRepository;
import com.wiget.Wiget.Repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductServiceInterface {

    private final ProductRepository productRepository;

    private final ProductCategoryRepository productCategoryRepository;


    public ProductService(ProductRepository productRepository,ProductCategoryRepository  productCategoryRepository) {
        this.productRepository = productRepository;
        this.productCategoryRepository = productCategoryRepository;
    }

    @Override
    public List<Product> viewAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(String id) {
        return productRepository.findById(id).orElseThrow(()-> new ProductNotFoundException("The product with " + id + "is not available"));
    }


    @Override
    public Product  addProduct(Product product) {
        String productCategoryId = product.getProductCategory().getId();
        ProductCategory  productCategory =   productCategoryRepository.findById(productCategoryId).orElseThrow(()-> new ProductCategoryNotFoundException(" Oops, we didnt find the requested product"));

        product.setProductCategory(productCategory);

        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {

       Product existingProduct = getProduct(product.getId());
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setColor(product.getColor());
        existingProduct.setSize(product.getSize());
        existingProduct.setMake(product.getMake());
        existingProduct.setModel(product.getModel());

        if(product.getProductCategory() != null && product.getProductCategory().getId() != null){
            String productCategoryId = product.getProductCategory().getId();
            ProductCategory  productCategory =   productCategoryRepository.findById(productCategoryId ).orElseThrow(()-> new ProductCategoryNotFoundException(" Oops, we didnt find the requested product"));
            product.setProductCategory(productCategory);
        }


        return productRepository.save(existingProduct);

    }

    @Override
    public void removeProduct(String id) {
        productRepository.deleteById(id);

    }
}
