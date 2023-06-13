package Lambda_And_Anonymous_Classes.AnonymousClass;

/**
 Anonymous class : is a class with no name, that we can use to instantiate only one object
 it can either extend any existing class, or implement any existing interface!
 */
public class AnonymousInnerClasses {
    public static void main(String[] args) {

        CrystalCreature crystalCreature = new CrystalCreature();
        crystalCreature.attack();
        System.out.println("CrystalCreature magical powers : "+crystalCreature.isMagicPowers());
        crystalCreature.getPowerOfMagic();
        System.out.println("CrystalCreature magical powers : "+crystalCreature.isMagicPowers()+"\nMagic type : "+crystalCreature.getPowerType());

        System.out.println("\n");
        CrystalCreature electricCrystalCreature = new CrystalCreature() {
            /** Here is the anonymous class, and we can override the original method*/

            @Override
            protected void attack() {
                System.out.println("Attacking with the Electric-Crystal beam power!");
            }
        };
        electricCrystalCreature.attack();
        System.out.println("electricCrystalCreature magical powers : "+electricCrystalCreature.isMagicPowers());
        electricCrystalCreature = new CrystalCreature() {
            @Override
            public void getPowerOfMagic(){
                setMagicPowers(true);
                setPowerType("Electric");
            }
        };
        electricCrystalCreature.getPowerOfMagic();
        System.out.println("electricCrystalCreature magical powers : "+electricCrystalCreature.isMagicPowers()+"\nMagic type : "+electricCrystalCreature.getPowerType());

        /**
         One of the applications of the anonymous class fe. is the Runnable interface!
         The Runnable interface is used esp when we want to create a multithreaded program, though to do so we will have to create
         a separate class that implements the Runnable interface, to get an object of that type and run the program.
         Or! we can use the anonymous class concept to perform that! ->
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("\nRunnable is running!");
            }
        };

        runnable.run();
    }

}
