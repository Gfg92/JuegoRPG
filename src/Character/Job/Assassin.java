package Character.Job;

import Character.Stat.*;

public class Assassin extends Job {
    @Override
    public int modifier(Stat stat) {
        int valor = 0;
        if (stat instanceof Dexterity) {
            valor = 3;
        } else if (stat instanceof Strength) {
            valor = 1;
        } else if (stat instanceof Constitution) {
            valor = 1;
        }
        return valor;
    }
}
