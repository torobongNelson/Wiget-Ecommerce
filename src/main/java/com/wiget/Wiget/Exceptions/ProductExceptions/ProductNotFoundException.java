package com.wiget.Wiget.Exceptions.ProductExceptions;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message){
        super(message);
    }
}
