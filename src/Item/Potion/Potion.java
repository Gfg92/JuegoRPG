package Item.Potion;
import Character.CharacterPj;
import Item.IConsumable;
import Item.IPickable;


public abstract class Potion implements IConsumable, IPickable {
    // Atributos
    private double power;
    private double weight;

    @Override
    public double getWeight() {
        return weight;
    }

    // Constructor
    public Potion(double power, double weight) {
        this.power = power;
        this.weight = weight;
    }

    // Metodos
    public void consumedBy(CharacterPj character) {
        character.heals(power);
    }


    // Imprimir
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
