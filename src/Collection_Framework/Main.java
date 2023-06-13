package Collection_Framework;

import Collection_Framework.Collections.CollectionsMain;
import Collection_Framework.Collections.Lists;

import java.util.Collections;

public class Main {

    /**
     I : an abbreviation for interface
     C : an abbreviation for class

                                       Iterable (I)
                                            |
                                      Collection (I)
                                            |
                   List (I)              Queue (I)            Set (I)
                      |                     |                    |
                 ArrayList (C)        PriorityQueue (C)       HashSet (C)
                      |
                 LiknedList (C)


     #Collection : it implements the Iterable interface, and add extra functionality. As well, it represents the object that can act as a container or a collection of objects!

     #Iterable interface : it's a part of the java.lang package, thus it's one of the base interfaces in java!

     #When using any of the classes that implement the Iterable interface, LinkedList, ArrayList etc...
      it's always the best practice to make it iterable, and traverse it using iterator instead of its own methods of traversing!

     #The for-each loop functions based on the iterator, it will use the iterator.hasNext() method looping through the provided data structure!
      -> Though, NOTE! that it's crucial for the collection derived classes to implement the Iterable interface so the for loop gets able to traverse it
         through the iterator!!!
     */

    public static void main(String[] args) {
        CollectionsMain.show();

        System.out.println("\nList interface : ");
        Lists.show();
    }

}
