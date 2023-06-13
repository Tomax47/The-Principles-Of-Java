package Exceptions_Handiling;

/**
 Exception handling is a crucial practice to prevent a specific error from making the program
 terminate and show that big ass red error/exception message in the terminal!
 */
public class ExceptionsHandling {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};

        try {
            /**
             Without applying the try catch, the following sout statement will cause the program to show the outOfBound error and will terminate!
             Any code after the line that caused the exception won't be executed!!
             */

            System.out.println(array[5]);
            //The following sout statement won't work unless there were no exceptions in the previous code lines
            System.out.println("The code has been executed without exceptions!");

        } catch (ArrayIndexOutOfBoundsException e ) { //we can add Exception instead of ArrayIndexOutOfBoundsException to catch all sorta exceptions!
            System.out.println("The index provided is out of bound!" +
                    ",Let's try to print the last element of the array instead : "
                    + array[array.length - 1]);
        }

        /**
         The above given exception handling will catch only the outOfBound exception
         thus, to catch all kinda exceptions, we can use Exception in the catch
         */


        /**
                                           {THROWN EXCEPTION}

         A thrown exception happens when an exception occurs and it aint caught right away at the line of code
         that caused it, but instead being thrown till a catch statement catches it..

         Fe. ->
         */

        try {
            getNumber(array);
        } catch (Exception e) {
            System.out.println("Out of the bound, the array's size is : "+array.length);
        }

        /**
         We can handle many types of exceptions by using multiple catch statements, or by using the | after each exception in a single catch statement
         Fe. ->
         */

        try {
            int number = Integer.parseInt("Hello");
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("No number can be made out of a text!");
        } finally {
            System.out.println("\nThe end of the operations!!");
        }

        /**
         Finally block : it contains the block of the code that u want to be executed whether an exception occurred or no
         Fe. ^above^

         The finally-statement always override any return statement in the try or catch blocks
         Lets take the printNumber() method as an example ->

            The method will cause no exceptions, so the catch block won't be called, thus the logical output to be
            as a result of executing the method is 3, no?
            -> Actually nah, the output will be 6, as the finally-block overrides the try block and returns its return value!!

         We often won't need to add a return statement in the finally-block, and it's better to avoid it if it ain't necessary, also,
         this is a good interview question, so be aware of it ;)
         */

        System.out.println("printNumber() method output : "+printNumber());
    }

    private static int getNumber(int[] array){
        return array[5];
    }

    private static int printNumber(){
        try {
            return 2;
        } catch (Exception e) {
            return 4;
        } finally {
            return 6;
        }
    }
}
