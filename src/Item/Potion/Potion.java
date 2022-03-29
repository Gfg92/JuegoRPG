package Item.Potion;
import Character.CharacterPj;
import Item.IPickable;


public abstract class Potion implements IPickable {
    private double power;

    public Potion(double power) {
        this.power = power;
    }

    public void consumedBy(CharacterPj character) {
        character.heals(power);
    }



    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
