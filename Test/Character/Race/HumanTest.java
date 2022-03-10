package Character.Race;

import Character.Stat.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    Stat stat;
    Race race;

    @Test
    void modifierConstitution() {
        stat = new Constitution(0);
        race = new Orc();
        assertEquals(2, race.modifier(stat));
    }

    @Test
    void modifierStrength() {
        stat = new Strength(0);
        race = new Orc();
        assertEquals(2, race.modifier(stat));
    }

    @Test
    void modifierDexterity() {
        stat = new Dexterity(0);
        race = new Orc();
        assertEquals(1, race.modifier(stat));
    }
}