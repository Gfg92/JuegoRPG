package Character.Job;

import Character.Stat.*;

public class Mage extends Job{
    @Override
    public int modifier(Stat stat) {
        int valor = 0;
        if (stat instanceof Intelligence) {
            valor = 4;
        } else if (stat instanceof Dexterity) {
            valor = 1;
        }
        return valor;
    }
}
