package Collection_Framework.Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsMain {
    public static void show(){
        Collection<String> names = new ArrayList<>();
        Collections.addAll(names,"SpongeBob","Patrick", "Squid-ward","Sandy","Mr. Crab");
        for (var name : names) {
            System.out.println(name);
        }

        System.out.println("Number of names in the collection : "+names.size());
        System.out.println("Does the names collection contain the name SpongeBob : "
                +names.contains("SpongeBob")+
                "\nWhat about the name Marcus ? "+names.contains("Marcus"));


        System.out.println("Let's clear the collection : "); names.clear();
        System.out.println("Collection is empty ? "+names.isEmpty());

        System.out.println("Let's add two names and convert the collection to array... ");
        Collections.addAll(names,"Lucas","Alex");

        /**
         #If we ain't passed any args in the toArray() method, it will return an object array
          So let's make it return a String array!

         -> We left the size value by zero, cause it ain't mandatory to count the elements in the collection
            and specify it, in order to convert it into an array! cuz the method will create an array with enough capacity to hold all the items!
         */
        String[] stringNames = names.toArray(new String[0]);
        System.out.print("Names added : ");
        for (var name : stringNames) {
            System.out.println(name);
        }

        /**

         -> Let's take a look at " == " and " .equals() " method!

         #The == sign : compares the objects by their references "their address in the memory"
         thus if we create another collection of the same data structure, and compare it to the names using the == signs,
         it will return false even if they carry the same values "names"!

         # THUS, to compare the values of two collections, we will need to use the ".equals()" method, which will compare the values carried in these collections!

         #When we initialized a new collection "newNames", we did initialize a new object that has its own address on the memory, which differs from the address of the previous name collection
         Thus by using the " == " sign and comparing their memory address, we will get false as a result!
         Unlike using the " .equals() " method which will compare the values each of them is holding, and in our case the return value is going to be true!

         */

        Collection<String> newNames = new ArrayList<>();
        newNames.addAll(names);

        System.out.println("NewNames collection's names : ");
        for (var name : newNames) {
            System.out.print(name+", ");
        }

        System.out.println("\nAre they equal by the ' == ' sign |By the address in the memory| ? "+ (names == newNames));
        System.out.println("Are they equal by the ' .equals() ' method |By the values each of 'em is holding| ? "+names.equals(newNames));

    }
}
