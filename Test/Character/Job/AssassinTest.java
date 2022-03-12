package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssassinTest {
    Stat stat;
    Job job;

    @Test
    void modifierDexterity() {
        stat = new Dexterity(0);
        job  = new Assassin();
        assertEquals(3, job.modifier(stat));
    }
    @Test
    void modifierStrength() {
        stat = new Strength(0);
        job = new Assassin();
        assertEquals(1, job.modifier(stat));
    }
    @Test
    void modifierConstitution() {
        stat = new Constitution(0);
        job = new Assassin();
        assertEquals(1, job.modifier(stat));
    }

}