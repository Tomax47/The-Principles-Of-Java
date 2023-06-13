package Abstract_Classes_And_Interfaces;

/**
 The interface class has only abstract methods, and it differs from the abstract
 by the fact that we can implement as many interfaces as we want, unlike the abstract class
 as we can extend only one abstract class!
 */
public interface AnimalFeatures {

    public void bodyColor();
    public void eyeColor();
    public boolean illnesses();
    public int attitude(); //Rating out of 10 "10 is the best".

    /**
     In interfaces if we declare any fields "lets say int age" it's gonna be
     static & final!!!

     Take into account that this field will be the same for every class that implements
     the interface, which makes it without a sense to use such fields when having various different classes!
     */

    //We must give a value cuz its final!
    int approxYearsToLive = 10;
}
