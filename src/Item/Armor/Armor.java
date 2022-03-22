package Item.Armor;

import Character.Stat.Stat;
import Item.IEquippable;
import Character.CharacterPj;

public abstract class Armor implements IEquippable {
    //Atributos
    private double value;
    private double weight;

    //getters y Setters
    public double getValue() {
        return value;
    }

    public double getWeight() {
        return weight;
    }

    //Constructor
    public Armor(String name, double value, double weight) {
        this.value = value;
        this.weight = weight;
    }

    // Metodos
    public abstract int modifier(Stat stat);

    @Override
    public void equippedBy(CharacterPj character) {
        character.heals(value);
    }
    @Override
    public void where(CharacterPj character){

    }
}
