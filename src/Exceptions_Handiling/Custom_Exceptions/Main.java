package Exceptions_Handiling.Custom_Exceptions;

public class Main {
    public static void main(String[] args) throws NegativeAgeException {

        validateAge(-1);

        /** Note that we can't wrap it in a try-catch block like we did with the other exceptions as well! */
    }

    private static void validateAge(int age) throws NegativeAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Negative value of age ain't exist!",new RuntimeException());
        }
    }
}
