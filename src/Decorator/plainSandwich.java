package Decorator;

public class plainSandwich implements Sandwich {

    @Override
    public String getDescription() {
        return "Baton";
    }

    @Override
    public double getCost() {
        return 0.50;
    }
}
