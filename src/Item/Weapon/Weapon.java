package Item.Weapon;

import Character.Stat.Stat;
import Item.IEquippable;
import Item.IPickable;


public abstract class Weapon implements IPickable, IEquippable {
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
    // Metodos
    public abstract int modifier (Stat stat);


}
