package com.wiget.Wiget.Exceptions.ProductExceptions;

public class ProductNoLongerExistException extends RuntimeException{
    public ProductNoLongerExistException(String message){
        super(message);
    }

}
