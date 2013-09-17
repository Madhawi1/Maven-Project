package com.mycompany.mavenprojectnic.exception;

/**
 *
 * @author Madhawi
 */
public class InvalidInterpretorException extends Exception{
    
    public InvalidInterpretorException(){
        super("Invalid NIC number");
    }
}
