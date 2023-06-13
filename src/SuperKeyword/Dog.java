package SuperKeyword;

public class Dog extends Animal{

    protected String favFood;

    public Dog(){}

    /**
     To avoid such code duplications, like the this.name & this.age
     which alrdy exist in the Animal class, we sue the super keyword!
     */
//    public Dog(String name, int age, String favFood) {
//        this.name = name;
//        this.age = age;
//        this.favFood = favFood;
//    }

    /**
     The constructor super keyword must be used only in the constructor method
     as well it must be always the first line in the method so we aint encounter any errors!
     */
    public Dog(String name, int age, String favFood) {
        super(name,age);
        this.favFood = favFood;
    }

    @Override
    public void whoAreYou(){
        System.out.println("Im a dog!");
    }

    @Override
    public void makeNoise(){
        /** We use the super keyword if we wanna call the function
          of the method like its in the parent class */
        super.makeNoise();
        System.out.println("Woof woff!");
    }
}
