package Abstract_Classes_And_Interfaces;

/**
 The abstract class is a class that we cant instantiate, but
 use as a parent class for other sub-classes.

 It's used to hold variables and methods, that are needed in many other subclasses
 though without initializing any values for 'em!
 */
public abstract class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Abstract methods
    public abstract void makeNoise();
    public abstract void eat();
}
