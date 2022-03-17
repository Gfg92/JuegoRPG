package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Golem extends Race{
    @Override
    public int modifier(Stat stat) {
        int valor = 0;
        if(stat instanceof Constitution){
            valor = 4;
        } else if (stat instanceof Strength){
            valor = 4;
        } else if (stat instanceof Dexterity){
            valor = -3;
        }
        return valor;
    }
}
