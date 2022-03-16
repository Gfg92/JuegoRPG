package Item.Food;

import Character.CharacterPj;
import Item.IConsumable;

public abstract class Food implements IConsumable {
    private double power;

    public Food(double power) {
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
