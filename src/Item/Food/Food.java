package Item.Food;

import Character.CharacterPj;
import Item.IConsumable;
import Item.IPickable;


public abstract class Food implements IConsumable, IPickable {
    // Atributos
    private double power;
    private double weight;

    @Override
    public double getWeight() {
        return weight;
    }

    // Constructor
    public Food(double power, double weight) {
        this.power = power;
        this.weight = weight;
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
