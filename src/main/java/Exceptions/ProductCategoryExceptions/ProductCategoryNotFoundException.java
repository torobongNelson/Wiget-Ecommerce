package Exceptions.ProductCategoryExceptions;

public class ProductCategoryNotFoundException extends RuntimeException {

    public ProductCategoryNotFoundException(String message){
        super(message);
    }

}
