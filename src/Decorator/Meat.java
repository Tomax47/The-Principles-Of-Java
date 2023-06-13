package Decorator;

public class Meat extends IngredientsDecorator{

    protected double gramsOfMeat;

    public Meat(Sandwich newSandwich, double gramsOfMeat) {
        super(newSandwich);
        this.gramsOfMeat = gramsOfMeat;
    }

    public String getDescription(){
        return sandwich.getDescription()+", "+gramsOfMeat+" grams of meat";
    }

    public double getCost(){
        return sandwich.getCost()+(0.0150 * gramsOfMeat);
    }
}
