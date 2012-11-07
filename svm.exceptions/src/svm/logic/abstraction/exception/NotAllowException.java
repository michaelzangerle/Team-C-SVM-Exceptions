package svm.logic.abstraction.exception;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Projectteam : Team C
 * Date: 07.11.12
 */
public class NotAllowException extends Exception implements Serializable,Remote {
    public NotAllowException(String message) {
        super(message);
    }
}
