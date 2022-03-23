package Item.Potion;

import Item.IConsumable;
import Character.CharacterPj;
import Item.IPickable;


public abstract class Potion implements IConsumable, IPickable {
    private double power;

    public Potion(double power) {
        this.power = power;
    }

    @Override
    public void consumedBy(CharacterPj character) {
        character.heals(power);
    }



    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
