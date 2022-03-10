package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GolemTest {

    Stat stat;
    Race race;

    @Test
    void modifierConstitution() {
        stat = new Constitution(0);
        race = new Golem();
        assertEquals(4, race.modifier(stat));
    }

    @Test
    void modifierStrength() {
        stat = new Strength(0);
        race = new Golem();
        assertEquals(4, race.modifier(stat));
    }

    @Test
    void modifierDexterity() {
        stat = new Dexterity(0);
        race = new Golem();
        assertEquals(-3, race.modifier(stat));
    }
}