package Collection_Framework.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
    /**
     #The list interface represents an order collection!

     #In the Collection interface, we ain't give attention about the index of the elements, we just pay care for adding, removing elements etc...
      On the other hand, with the list we care for the index of the elements, thus if we wanna work with ordered collections, we should use the List interface!
     */
    public static void show(){

        List<String> players = new ArrayList<>();
        players.add("Messi");
        players.add("Ronaldo");
        players.add("De Maria");

        players.add(0,"G. Jesus");
        System.out.println(players);

        Collections.addAll(players,"Luka Mordric", "Toni Kross", "Benzima");
        System.out.println("Lasted added player : "+players.get(players.size() - 1));
        System.out.println("Change first player to Neymar : "+players.set(0,"Neymar")+
                "\nNew first player : "+players.get(0));

        System.out.println("Does G. Jesus exist |In case of -1 result, means not found| ? "+players.indexOf("G. Jesus"));

        /** The lastIndexOf() method gives the last index of the element, meaning, if the element appeared twice+,
            it's going to return its last index in which it appeared! */

        players.add(players.size() - 2,"Messi");
        System.out.println("Last place of Messi in the list |The output is the index & -1 output means not found| : "+
                players.lastIndexOf("Jesus"));

        /**

         #The .subList() method : it will allow us to print to return a subList from the list we have, taking 2 indexes,
          this first is included, though the last is not!

         #NOTE! this method won't affect the original list, as it creates a new list for the subList we want!
         */
        System.out.println("The players in the places 3-4-5 are : "+players.subList(3,6));
        System.out.println("Final list : "+players);
    }
}

