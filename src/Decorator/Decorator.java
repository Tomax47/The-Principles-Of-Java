package Decorator;

/**
           STRUCTURAL DESIGN PATTERNS

 Decorator :  A structural design pattern that lets you attach a new behaviour to an object
              by placing this object in a special wrapper that contains these behaviours!
 */

public class Decorator {
    public static void main(String[] args) {
        Sandwich sandwich = new Eggs(new Cheese(new Meat(new plainSandwich(),100),35),2);
        Sandwich sandwich1 = new Cheese(new Meat(new Lettuces(new plainSandwich(),2),150),50);
        Sandwich hotDog = new Sausages(new Lettuces(new Cheese(new plainSandwich(),35),2),2);

        System.out.println("Ingredients : "+sandwich.getDescription()
        +"\nTotal cost : "+sandwich.getCost()+"$"
        );

        System.out.println("\nIngredients : "+sandwich1.getDescription()
                +"\nTotal cost : "+sandwich1.getCost()+"$"
        );

        System.out.println("\nIngredients : "+hotDog.getDescription()
                +"\nTotal cost : "+hotDog.getCost()+"$"
        );
    }
}
