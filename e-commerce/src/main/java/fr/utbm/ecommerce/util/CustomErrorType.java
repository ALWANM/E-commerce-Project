package fr.utbm.ecommerce.util;
 
/**
 * Entity custom error type
 *
 */
public class CustomErrorType {

    private String errorMessage;

    /**
     * Sets error 
     * @param errorMessage the message
     */
    public CustomErrorType(String errorMessage){
        this.errorMessage = errorMessage;
    }

    /**
     * Gets the error message
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

}
