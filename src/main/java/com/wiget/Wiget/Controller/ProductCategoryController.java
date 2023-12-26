package com.wiget.Wiget.Controller;

import com.wiget.Wiget.Models.ProductCategory;
import com.wiget.Wiget.Services.ProductCategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productCat")
public class ProductCategoryController {

    private final ProductCategoryService productCategoryService;


    public ProductCategoryController(ProductCategoryService productCategoryService ){
        this.productCategoryService = productCategoryService;
    }

    @GetMapping("/product-categories")
    public List<ProductCategory> productCategories(){
        return productCategoryService.viewProductCategories();
    }

    @PostMapping("/add-productCategory")
    public ProductCategory saveProductCategory(@RequestBody ProductCategory productCategory){
       return productCategoryService.addProductCategory(productCategory);
    }


}
