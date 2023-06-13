package Lambda_And_Anonymous_Classes.AnonymousClass;

import lombok.Data;

@Data
public class CrystalCreature implements MagicalPower {

    private boolean magicPowers;
    private String powerType;
    protected void attack(){
        System.out.println("Attacking with the crystal beam power!");
    }

    @Override
    public void getPowerOfMagic() {
        setMagicPowers(true);
        setPowerType("General");
    }
}
