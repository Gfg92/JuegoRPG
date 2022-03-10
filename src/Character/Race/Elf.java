package Character.Race;

import Character.Stat.*;

public class Elf extends Race{

    //Devuelve el modificador de la raza segun el stat
    @Override
    public int modifier(Stat stat) {
        int valor = 0;
        if(stat instanceof Constitution){
            valor = -1;
        } else if (stat instanceof Dexterity){
            valor = 3;
        } else if (stat instanceof Intelligence){
            valor = 3;
        }

        return valor;
    }
}
