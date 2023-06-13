package Comparable_Comparator;

import java.util.Comparator;

/**
  We can create a separate general class for comparisons, and insert in it all the comparisons we want, or add the comparator
  to the actual class "This case : the Laptop class!
 */
public class CompareByRamCapacity implements Comparator<Laptop> {

    @Override
    public int compare(Laptop o1, Laptop o2) {
        if (o1.getRam() == o2.getRam()) {
            return 0;
        } else {
            return (o1.getRam() > o2.getRam() ? 1 : -1);
        }
    }

}
