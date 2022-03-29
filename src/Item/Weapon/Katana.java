package Item.Weapon;


import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;
import Character.CharacterPj;

public class Katana extends Weapon {
    // Atributos
    private String name;

    // Constructor
    public Katana(String name,int value, double weight) {
        super("Katana",10,20);
    }

    // Metodos
    @Override
    public int modifier (Stat stat){
        int valor = 0;
        if(stat instanceof Strength){
            valor = 1;
        }
        else if (stat instanceof Dexterity){
            valor = 2;
        }
        return valor;
    }


    @Override
    public void pickedBy(CharacterPj character) {
        character.pickUp(this);
    }
}
