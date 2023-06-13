package Decorator;

public abstract class IngredientsDecorator implements Sandwich{

    protected Sandwich sandwich;

    public IngredientsDecorator(Sandwich newSandwich) {
        sandwich = newSandwich;
    }

    public String getDescription(){
        return sandwich.getDescription();
    }

    public double getCost(){
        return sandwich.getCost();
    }
}
