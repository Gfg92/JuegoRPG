package Item.Weapon;

import Item.IEquippable;
import Character.CharacterPj;


public abstract class Weapon implements IEquippable {
    // Atributos
    private double value;
    private double weight;

    // Getters y Setters
    public double getValue() {
        return value;
    }

    public double getWeight() {
        return weight;
    }

    //Constructor
    public Weapon(String name, double value, double weight) {
        this.value = value;
        this.weight = weight;
    }
    //Metodos
    @Override
    public void equipedBy(CharacterPj character){
        character.receivesDamage(value);
    }


}
