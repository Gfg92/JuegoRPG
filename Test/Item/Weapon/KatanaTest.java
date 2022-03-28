package Item.Weapon;

import Character.Stat.Stat;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KatanaTest {

    Stat stat;
    Weapon weapon;

    @BeforeEach
    void setUp() {
        stat = new Strength(5);
        weapon = new Katana("Katana", 5, 5);
    }

    @Test
    void modifierStrength() {
        assertEquals(1, weapon.modifier(stat));
    }
}