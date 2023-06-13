package Abstract_Classes_And_Interfaces;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Marcus",1,"Tuna");
        System.out.println("Name : "+cat.name+"\nAge : "+cat.age+"\nFav food : "+cat.favFood);
        System.out.print("Color : ");cat.bodyColor();
        System.out.print("Eyes' color : ");cat.eyeColor();
        System.out.println("Illnesses : "+cat.illnesses()+"\nAttitude rating : "+cat.attitude()+"\nApprox. years to live : "+cat.approxYearsToLive());
    }
}
