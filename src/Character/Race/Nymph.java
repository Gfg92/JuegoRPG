package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Nymph extends Race{
    //Devuelve el modificador de la raza segun el stat
    @Override
    public int modifier(Stat stat) {
        int valor = 0;
        if(stat instanceof Constitution){
            valor = -1;
        } else if (stat instanceof Strength){
            valor = -1;
        } else if (stat instanceof Intelligence){
            valor = 7;
        }

        return valor;
    }
}
