package Item.Weapon;

import Character.Stat.Stat;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GunTest {
    Stat stat;
    Weapon weapon;

    @BeforeEach
    void setUp() {
        stat = new Strength(5);
        weapon = new Gun("Gun", 5, 5);
    }

    @Test
    void modifierStrength() {
        assertEquals(0, weapon.modifier(stat));
    }
}