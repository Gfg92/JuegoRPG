package Character.Race;

import Character.Stat.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrcTest {
    Stat stat;
    Race race;

    @Test
    void modifierConstitution() {
        stat = new Constitution(0);
        race = new Orc();
        assertEquals(3, race.modifier(stat));
    }

    @Test
    void modifierStrength() {
        stat = new Strength(0);
        race = new Orc();
        assertEquals(5, race.modifier(stat));
    }

    @Test
    void modifierIntelligence() {
        stat = new Intelligence(0);
        race = new Orc();
        assertEquals(-3, race.modifier(stat));
    }
}