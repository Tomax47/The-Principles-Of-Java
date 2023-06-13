package Polymorphism;

/**
 Here for Adult class we applied the polymorphism, as we changed the functionality
 of the method of the parent class "Person", and customized it
 to function in a specific different way!
 */
public class Adult extends Person{
    private int salary;

    public int getSalary(){
        return salary;
    }

    public int setSalary(int salary) {
        return this.salary = salary;
    }

    @Override
    public void eat(){
        System.out.println("Im eating Pizza!");
    }

    @Override
    public void sleep(){
        System.out.println("Too early to sleep now!");
    }

    /**
     Method overloading: when having the same method, though
     with different variables
     */

    public void eat(String food) {
        System.out.println("Im eating "+food);
    }
}
