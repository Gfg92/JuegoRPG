package Character.Job;

import Character.Stat.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    Stat stat;
    Job job;

    @Test
    void modifiersStrength() {
        stat = new Strength(0);
        job = new Warrior();
        assertEquals(3, job.modifier(stat));
    }

    @Test
    void modifierConstitution() {
        stat = new Constitution(0);
        job = new Warrior();
        assertEquals(2, job.modifier(stat));
    }

}