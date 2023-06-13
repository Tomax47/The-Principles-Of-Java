package Stream_API;

import Collection_Framework.Collections.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream_Main {
    public static void main(String[] args) {

        /**

         #The filter method takes the arg Predicate, which is a functional interface that has the abstract method test, which takes an object T
          Thus, we can create an object of predicate and override the test method so it does the function we want!
          -> in this case : function as n % 2 != 0

         */

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 != 0;
            }
        };

        /**

         #The .map() method takes an arg of Function, which is an interface that owns an abstract method apply that takes an object of T as an arg!
          Thus, we can create a Function object to perform the function we want
          -> In this case : increment the odd value by one!
         */

        Function<Integer,Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
                return n+=1;
            }
        };

        /**
         If we wanna process and do some operations, we shouldn't change the original values, but process them in a new stream
         */
        List<Integer> numbers = Arrays.asList(2,0,-2,1,4,9);
        numbers.forEach(n -> System.out.print(n+" "));

        System.out.print("\nStreamData : ");
        Stream<Integer> numbersStreamData = numbers.stream();

        try {
            /** Let's say we want to take the values, check if it's an even number, if true double it, else take out one from it! */
            numbersStreamData.forEach(n -> {
                if (n % 2 == 0) {
                    n*=2;
                } else {
                    n--;
                }
                System.out.print(n+" ");
            });

            /** We can use the stream ONLY ONCE! meaning we can't use it again once we use it! Thus the numbersStreamData.count(); if not commented will cause an error! */
//            numbersStreamData.count();

            /** The .sorted() method will sort the List for us, and it will return another stream with the sorted values, meaning that we have got another stream that we can use and operate on for a single time only!*/
            System.out.print("\nSorted stream values : ");
            Stream<Integer> sortedNumbersStream = numbers.stream().sorted();
            sortedNumbersStream.forEach(n -> System.out.print(n + " "));

            System.out.print("\nMapped stream data : ");
            /**
                The .map() method can be used to perform operations on the values carried by a block of data! and it returns a new stream with the values!
                Meaning that we can store it in another new stream and operate on it...

                #Down bellow we called 2 streams, first with the .stream() method, the second with the .map() method, and we can even add .sorted() method and like that we would have been called 3 streams
                 Concerning the memory side, it won't affect it or consume ton of space in the memory, why??
                 -> Because each stream is being ended after getting operated on for one time, meaning by each new stream we create, we r replacing the old onces!, thus we ain't overloading the memory;)
             */
            Stream<Integer> mapStreamData = numbers.stream();

            mapStreamData
                    .filter(predicate) // The predicate plays the role of "n%2 != 0' odd number
                    .map(function) //The function plays the role of " n -> n+=1"
                    .forEach(n -> System.out.print(n+" "));

            mapStreamData.close();

            //Sum of incremented odd values
            int sum = numbers.stream()
                    .filter(predicate)
                    .map(function)
                    .reduce(0,(a,b) -> a+b);

            System.out.println(", and their sum is : "+sum);
            /**

             #Let's say we want to get the output of the sum of the incremented odd values!
              Here we will have to use the reduce() method...

             # .reduce() method :
                It takes the first arg as a value of the type T, then it takes the second arg as BinaryOperator!

             #The BinaryOperator is an interface that extends the BiFunction interface, which has the abstract method apply
              which takes the args a & b of the type generic!

             -> Thus we can initialize the first argument's value as 0, and then give two args, for the second arg and override the abstract method using lambda expression
                so, we add them together and at the end get the sum of the incremented odd values in the stream!
             */


        } catch (IllegalStateException e) {
            System.out.println("\nException occurred! -> "+e);
        } finally {
            numbersStreamData.close();
        }
    }
}
