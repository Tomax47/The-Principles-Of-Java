package SuperKeyword;

/**
 The super keyword can be used with public & protected methods
 but not with private ones!
 */
public class Super {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.whoAreYou();
        dog.makeNoise();

        Dog newDog = new Dog("Lucas", 3, "DryFood");

        System.out.println("\n"+newDog.name+", "+newDog.age+" yo. "+" FavFood is "+newDog.favFood);

    }
}
