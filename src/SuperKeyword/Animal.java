package SuperKeyword;

public class Animal {

    protected String name;
    protected int age;

    public Animal(){}
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void whoAreYou() {
        System.out.println("Im an animal");
    }

    public void makeNoise(){
        System.out.println("Shh");
    }
}
