package Character.Job;

import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Monk extends Job{
    @Override
    public int modifier(Stat stat) {
        int valor = 0;
        if (stat instanceof Intelligence) {
            valor = 7;
        } else if (stat instanceof Dexterity) {
            valor = 5;
        } else if (stat instanceof Strength){
            valor = -7;
        }
        return valor;
    }
}
