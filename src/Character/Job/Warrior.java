package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Warrior extends Job {
    @Override
    public int modifier(Stat stat) {
        int valor = 0;
        if (stat instanceof Strength) {
            valor = 3;
        } else if (stat instanceof Constitution) {
            valor = 2;
        }
        return valor;
    }
}
