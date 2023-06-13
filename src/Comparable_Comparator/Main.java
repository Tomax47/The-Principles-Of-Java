package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Alien",32,2000,"Core-i9",3470));
        laptops.add(new Laptop("Acer22",8,1000,"Core-i5",699));
        laptops.add(new Laptop("Asus",16,512,"Core-i7",895));

        System.out.println(laptops.get(0).compareTo(laptops.get(1)));

        //Price wise sorting
        System.out.println("\nBy price : ");
        Collections.sort(laptops);
        for (Laptop lap : laptops) {
            System.out.println(lap);
        }

        //Ram wise sorting
        System.out.println("\nBy Ram capacity : ");
        Collections.sort(laptops,new CompareByRamCapacity());
        for (Laptop lap : laptops) {
            System.out.println(lap);
        }

        //Rom wise sorting
        System.out.println("\nBy Rom capacity : ");
        Collections.sort(laptops,Laptop.RomComparator);
        for (Laptop lap : laptops) {
            System.out.println(lap);
        }
    }

    /**
                                                     SUMMARY

     #Comparable : is implemented by the class itself. It requires the class to implement the compareTo() method
                  which compares the object with another object of the same type!

     #Comparator : is an external class that implements the compare() method to compare two objects!

     */
}
