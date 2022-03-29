package Item.Jewelry;

import Character.Stat.Stat;
import Item.IEquippable;
import Item.IPickable;


public abstract class Jewelry implements IPickable, IEquippable {
    // Atributos
    private double weight;

    // Getters y Setters


    public double getWeight() {
        return weight;
    }

    //Constructor
    public Jewelry(String name, double weight) {
        this.weight = weight;
    }
}
