/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Darrin
 */
public class SupplyControlException extends Exception{

    public SupplyControlException() {
    }

    public SupplyControlException(String message) {
        super(message);
    }

    public SupplyControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public SupplyControlException(Throwable cause) {
        super(cause);
    }

    public SupplyControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
