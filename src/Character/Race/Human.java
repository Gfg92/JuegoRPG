package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Human extends Race{

    //Devuelve el modificador de la raza segun el stat
    @Override
    public int modifier(Stat stat) {
        int valor = 0;
        if(stat instanceof Constitution){
            valor = 2;
        } else if (stat instanceof Strength){
            valor = 2;
        } else if (stat instanceof Dexterity){
            valor = 1;
        }

        return valor;
    }
}
