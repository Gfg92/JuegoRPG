package Item.Weapon;


import Character.Stat.Stat;
import Character.Stat.Strength;

public class Katana extends Weapon {
    //Atributos
    private String name;

    //Constructor
    public Katana(String name,int value, double weight) {
        super("Katana",10,20);
    }
    @Override
    public int modifier (Stat stat){
        int valor = 0;
        if(stat instanceof Strength){
            valor =

        }
    }



}
