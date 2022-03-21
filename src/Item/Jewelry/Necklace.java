package Item.Jewelry;

import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Necklace extends Jewelry {
    // Atributos
    private String name;

    // Constructor
    public Necklace(String name,int value, double weight) {
        super("Necklace",5,2);
    }

    // Metodos
    @Override
    public int modifier (Stat stat){
        int valor = 0;
        if(stat instanceof Strength){
            valor = 1;
        }
        else if (stat instanceof Dexterity){
            valor = 1;
        }
        return valor;
    }

}
