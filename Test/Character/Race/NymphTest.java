package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NymphTest {

    Stat stat;
    Race race;

    @Test
    void modifierConstitution() {
        stat = new Constitution(0);
        race = new Nymph();
        assertEquals(-1, race.modifier(stat));
    }

    @Test
    void modifierStrength() {
        stat = new Strength(0);
        race = new Nymph();
        assertEquals(-1, race.modifier(stat));
    }

    @Test
    void modifierIntelligence() {
        stat = new Intelligence(0);
        race = new Nymph();
        assertEquals(7, race.modifier(stat));
    }
}