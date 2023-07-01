package com.example.miPrimerRest;

public class OrderNotFoundException extends RuntimeException{
    OrderNotFoundException(Long id){
        super("Could not find employee "+ id);
    }
}
