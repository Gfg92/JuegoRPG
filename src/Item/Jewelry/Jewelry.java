package Item.Jewelry;

import Character.Stat.Stat;



public abstract class Jewelry {
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
    public Jewelry(String name, double value, double weight) {
        this.value = value;
        this.weight = weight;
    }
    // Metodos
    public abstract int modifier (Stat stat);

}
