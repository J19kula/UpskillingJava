package com.revature.jan11.exceptionHandling;

public class InsufficientFundException extends Exception{
    public InsufficientFundException(){
        super();
    }

    public InsufficientFundException(String message){
        super(message);
    }

    public InsufficientFundException(String message, Throwable cause){
        super(message, cause);
    }

    public InsufficientFundException(Throwable cause){
        super(cause);
    }
}
