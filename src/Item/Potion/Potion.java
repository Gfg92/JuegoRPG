package Item.Potion;
import Character.CharacterPj;
import Item.IPickable;


public abstract class Potion implements IPickable {
    private double power;
    private double weight;
    @Override
    public double getWeight() {
        return weight;
    }
    public Potion(double power, double weight) {
        this.power = power;
        this.weight = weight;
    }

    public void consumedBy(CharacterPj character) {
        character.heals(power);
    }



    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
