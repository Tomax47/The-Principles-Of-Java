package Exceptions_Handiling.Custom_Exceptions;

/**
 To be able to throw our custom exception we need to make its class extends the Exception class

 NOTE! -> Don't extend Throwable or Error, cuz ts the coding convention, plus the Error is separate from the Exception
          as it deals with big/serious problems that we shouldn't be catching, like the out of memory error, stackOverFlow error etc...

 Also, it's best to extend the already built-in exception in java that is the closest to your type of exception, like in here
 we can extend the "IllegalArgumentException" instead of extending "Exception"
 */
public class NegativeAgeException extends IllegalArgumentException {

    /**
     IllegalArgumentException usage : Thrown to indicate that a method has been passed an illegal or inappropriate argument!
     */

    public NegativeAgeException(String message) {
        //Calling the Exception's classes version
        super(message);
    }
    public NegativeAgeException() {}

    public NegativeAgeException(Throwable cause) {
        /**
         u can here make ur custom exception takes a throwable exception, which will show the exception
         that caused the problem. Fe. -> RunTimeException etc..
         */
        super(cause);
    }

    public NegativeAgeException(String message, Throwable cause){
        super(message,cause);
    }
}
