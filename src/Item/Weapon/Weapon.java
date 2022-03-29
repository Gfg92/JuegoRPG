package Item.Weapon;

import Character.Stat.Stat;
import Item.IEquippable;
import Item.IPickable;


public abstract class Weapon implements IEquippable {
    // Atributos

    private double weight;

    // Getters y Setters


    public double getWeight() {
        return weight;
    }

    //Constructor
    public Weapon(String name, double weight) {

        this.weight = weight;
    }
    // Metodos
    public abstract int modifier (Stat stat);


}
