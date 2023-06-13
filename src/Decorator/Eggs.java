package Decorator;

public class Eggs extends IngredientsDecorator{

    protected int numberOfEggs;

    public Eggs(Sandwich newSandwich, int numberOfEggs) {
        super(newSandwich);
        this.numberOfEggs = numberOfEggs;
    }

    @Override
    public String getDescription(){
        return sandwich.getDescription()+", "+numberOfEggs+" Egg/s";
    }

    @Override
    public double getCost(){
        return sandwich.getCost() + (0.50 * numberOfEggs);
    }
}
