package Stream_API;

import Collection_Framework.Collections.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Main {
    public static void main(String[] args) {

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
                    .map(n -> {
                        if (n % 2 != 0) {
                            n++;
                    } else {
                        n /= 2;
                    }
                    return n;
                })
                    .forEach(n -> System.out.print(n+" "));

            mapStreamData.close();

        } catch (IllegalStateException e) {
            System.out.println("\nException occurred! -> "+e);
        } finally {
            ;numbers.clear();
            numbersStreamData.close();
        }
    }
}
