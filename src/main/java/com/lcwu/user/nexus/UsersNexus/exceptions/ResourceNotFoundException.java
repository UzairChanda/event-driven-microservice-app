package com.lcwu.user.nexus.UsersNexus.exceptions;

public class ResourceNotFoundException  extends  RuntimeException{

    public ResourceNotFoundException(){
        super("Given Id does not exists!!!");
    }

    public  ResourceNotFoundException(String message){
        super(message);
    }

}
