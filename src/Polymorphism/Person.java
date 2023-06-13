package Polymorphism;

public class Person {
    private String name;
    private int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("Im eating!");
    }

    public void sleep(){
        System.out.println("Goodnight!");
    }

    private String getName(){return name;}
    private int getAge(){return age;}
}
