package Decorator;

public class Lettuces extends IngredientsDecorator{

    protected int lettuceLeaves;

    public Lettuces(Sandwich newSandwich, int lettuceLeaves) {
        super(newSandwich);
        this.lettuceLeaves = lettuceLeaves;
    }

    public String getDescription(){
        return sandwich.getDescription()+", "+lettuceLeaves+" leaves of lettuce";
    }

    public double getCost(){
        return sandwich.getCost()+(0.25 * lettuceLeaves);
    }
}
