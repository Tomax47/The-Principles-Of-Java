package Abstract_Classes_And_Interfaces;

public class Cat extends Animal implements AnimalFeatures{
    protected String favFood;

    public Cat(String name, int age, String favFood) {
        super(name, age);
        this.favFood = favFood;
    }

    public Cat() {}

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Num num");
    }

    @Override
    public void bodyColor() {
        System.out.println("White");
    }

    @Override
    public void eyeColor() {
        System.out.println("Blue");
    }

    @Override
    public boolean illnesses() {
        return false;
    }

    @Override
    public int attitude() {
        return 8;
    }

    public int approxYearsToLive(){
        return approxYearsToLive;
    }
}
