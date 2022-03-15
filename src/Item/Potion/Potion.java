package Item.Potion;

import Item.IConsumable;
import Character.CharacterPj;

public abstract class Potion implements IConsumable {
    private double power;

    public Potion(double power) {
        this.power = power;
    }

    @Override
    public void consumedBy(CharacterPj character) {
        character.heals(power);

    }

}
