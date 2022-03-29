package Item.Weapon;

import Character.Stat.*;
import Character.CharacterPj;
public class Gun extends Weapon{
    // Atributos
    private String name;

    //Constructor
    public Gun (String name,int value, double weight) {
        super("Walther", 10, 5);
    }
    // Metodos
    @Override
    public int modifier (Stat stat){
        int valor = 0;
        if(stat instanceof Intelligence){
            valor = 1;
        }
        else if (stat instanceof Constitution){
            valor = 2;
        }
        return valor;
    }

    @Override
    public void pickedBy(CharacterPj character) {
        character.pickUp(this);
    }

    @Override
    public void equippedBy(CharacterPj character) {
        character.equippabled(this);
    }
}
