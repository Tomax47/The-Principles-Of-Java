package Decorator;

public class Sausages extends IngredientsDecorator {

    protected int numberOfSausages;

    public Sausages(Sandwich newSandwich, int numberOfSausages) {
        super(newSandwich);
        this.numberOfSausages = numberOfSausages;
    }

    public String getDescription(){
        return sandwich.getDescription()+", "+numberOfSausages+" piece/s of sausages";
    }

    public double getCost(){
        return sandwich.getCost()+(0.55 * numberOfSausages);
    }
}
