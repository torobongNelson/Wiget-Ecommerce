package com.wiget.Wiget.Controller;

import com.wiget.Wiget.Models.Product;
import com.wiget.Wiget.Services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity< List<Product>> getProducts(){
        List<Product> allProducts = productService.viewAllProducts();
        return new ResponseEntity<>(allProducts,HttpStatus.OK);
    }

    @GetMapping("/{id}") public ResponseEntity< Product> getProduct(@PathVariable("id") String id){
       Product product =  productService.getProduct(id);
       return new ResponseEntity<>(product,HttpStatus.OK);
    }

   @PostMapping("/addProduct")
   public  ResponseEntity<Product> saveProduct(@RequestBody Product product){
        Product newProduct = productService.addProduct(product);
        return new ResponseEntity<>(newProduct,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product){
        Product updatedProduct = productService.updateProduct(product);
        return new ResponseEntity<>(updatedProduct,HttpStatus.CREATED);
    }
}
