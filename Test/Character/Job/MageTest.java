package Character.Job;

import Character.Stat.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {
    Stat stat;
    Job job;

    @Test
    void modifiersIntelligence() {
        stat = new Intelligence(0);
        job = new Mage();
        assertEquals(4, job.modifier(stat));
    }

    @Test
    void modifierDexterity() {
        stat = new Dexterity(0);
        job = new Mage();
        assertEquals(1, job.modifier(stat));
    }

}