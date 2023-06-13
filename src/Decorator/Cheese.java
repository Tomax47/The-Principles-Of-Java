package Decorator;

public class Cheese extends IngredientsDecorator{
    protected double gramsOfCheese;

    public Cheese(Sandwich newSandwich, double amountOFCheeseInGrams ) {
        super(newSandwich);
        this.gramsOfCheese = amountOFCheeseInGrams;
    }

    public String getDescription(){
        return sandwich.getDescription()+", "+gramsOfCheese+" grams of cheese";
    }

    public double getCost(){
        return sandwich.getCost()+ (0.10 * gramsOfCheese);
    }
}
