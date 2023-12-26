package Exceptions.AuthenticationExceptions;

public class InvalidCredentialsExceptions extends RuntimeException{
    public InvalidCredentialsExceptions(String message){
        super(message);

    }
}
