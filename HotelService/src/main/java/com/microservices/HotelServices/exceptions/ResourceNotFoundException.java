package com.microservices.HotelServices.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String s) {

    }

    public ResourceNotFoundException(){
        super("Resource is not found!!");
    }
}
