package Character.Job;

import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShamanTest {
    Stat stat;
    Job job;
    @Test
    void modifierIntelligence() {
        stat = new Intelligence(0);
        job = new Shaman();
        assertEquals(2, job.modifier(stat));
    }
    @Test
    void modifierDexterity() {
        stat = new Dexterity(0);
        job = new Shaman();
        assertEquals(2, job.modifier(stat));
    }
    @Test
    void modifierStrength() {
        stat = new Strength(0);
        job = new Shaman();
        assertEquals(1, job.modifier(stat));
    }
}