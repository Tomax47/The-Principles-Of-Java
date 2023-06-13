package Comparable_Comparator;

import lombok.*;

import java.util.Comparator;

@Data
public class Laptop implements Comparable<Laptop>{

    private String model;
    private int Ram;
    private String processor;
    private int price;

    private int Rom;

    public Laptop(String model, int ram, int Rom ,String processor, int price) {
        this.model = model;
        this.Ram = ram;
        this.Rom = Rom;
        this.processor = processor;
        this.price = price;
    }

    public Laptop(){}

    /**
     The Comparable interface, is implemented inside the class and takes only one object
     plus there ain't any need to create a separate class, as in Comparator!
     */
    @Override
    public int compareTo(Laptop lap) {
        /** Compare the prices */
        if (this.price == lap.getPrice()) {
            return 0;
        } else {
            return (this.price > lap.getPrice() ? 1 : -1);
        }
    }


    /**
     An inside comparator, we can add as many as we desire!
     Note! that we can also add it to the Comparator class...
     */
    public static Comparator<Laptop> RomComparator = new Comparator<Laptop>() {
        @Override
        public int compare(Laptop o1, Laptop o2) {
            if (o1.getRom() == o2.getRom()) {
                return 0;
            } else {
                return (o1.getRom() > o2.getRom() ? 1 : -1);
            }
        }
    };
}
