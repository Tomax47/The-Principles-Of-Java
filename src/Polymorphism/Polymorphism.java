package Polymorphism;

/**
  Polymorphism simply means many forms!
 */
public class Polymorphism {
    public static void main(String[] args) {
        Person person = new Person();
        Adult adult = new Adult();
        Kids kid = new Kids();

        person.eat();
        person.sleep();

        kid.eat();
        kid.sleep();

        adult.eat();
        adult.sleep();
        adult.eat("Carrots");
    }
}
