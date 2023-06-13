package Lambda_And_Anonymous_Classes.Lambda;

import java.util.Random;
import java.util.Scanner;

/**
 Lambda can be sued only with functional interfaces "interfaces that have a single abstract method and only one"
 */
public class Lambda {
    public static void main(String[] args) {
        /**
         So, how can we manipulate the method so it gives us a slightly different output!?
         -> 
         */

        getNumber(
                () -> {
                    Random rnd = new Random();
                    int n = rnd.nextInt(0,10);
                    System.out.println(n);
                    return n;
                }
        );

        int c =4, d =5;
        getTheSum(
                (a, b) -> {
                    int sum = a + b;
                    System.out.println("Sum of "+a+" & "+b+" = "+sum);
                    return sum;
                }
        , c,d);

        Scanner scan = new Scanner(System.in);
        System.out.print("Choose the animal [Dog | Cat] : ");
        String animal = scan.nextLine();
        makeNoise(
                (s) -> {
                    String sound = "";
                    switch (animal) {
                        case "Dog" :
                            sound = "Woof Woof!";
                            break;
                        case "Cat" :
                            sound = "Meow Meow!";
                            break;
                        default:
                            break;
                    }
                    System.out.println("Animal says : "+sound);
                    return sound;
                }
        ,animal);
    }
    
    
    public static int getNumber(getaNumber gNumber) {
        return gNumber.generateANumber();
    }

    public static int getTheSum(getTheSum sum, int a, int b) {
        return sum.getSumOfTheNumbers(a,b);
    }

    public static void makeNoise(MakeANoise sound, String animal) {
        sound.makeNoise(animal);
    }
}
