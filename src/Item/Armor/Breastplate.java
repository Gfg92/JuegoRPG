package Item.Armor;

import Character.Stat.*;
import Character.CharacterPj;

public class Breastplate extends Armor{
    // Atributos
    private String name;

    // Constructor
    public Breastplate(String name,int value, double weight) {
        super("Breastplate",10,20);
    }

    // Metodos
    @Override
    public int modifier (Stat stat){
        int valor = 0;
        if(stat instanceof Constitution){
            valor = 2;
        }
        else if (stat instanceof Dexterity){
            valor = 2;
        }
        else if (stat instanceof Intelligence){
            valor = 1;
        }
        return valor;
    }

    @Override
    public void pickedBy(CharacterPj character) {
        character.pickUp(this);
    }
}
