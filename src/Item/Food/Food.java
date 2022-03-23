package Item.Food;

import Character.CharacterPj;
import Item.IConsumable;
import Item.IPickable;


public abstract class Food implements IConsumable, IPickable {
    // Atributos
    private double power;

    // Constructor
    public Food(double power) {
        this.power = power;
    }

    //Metodos
    @Override
    public void consumedBy(CharacterPj character) {
        character.heals(power);
    }

    // Imprimir
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
