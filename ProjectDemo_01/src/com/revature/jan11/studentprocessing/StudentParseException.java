package com.revature.jan11.studentprocessing;

public class StudentParseException extends Exception{
    public StudentParseException(){
        super();
    }

    public StudentParseException(String message){
        super(message);
    }

    public StudentParseException(String message, Throwable cause){
        super(message, cause);
    }

    public StudentParseException(Throwable cause){
        super(cause);
    }
}
