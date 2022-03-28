package Item.Weapon;

import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KatanaTest {

    Strength strength;
    Dexterity dexterity;
    Weapon weapon;

    @BeforeEach
    void setUp() {
        strength = new Strength(5);
        dexterity = new Dexterity(3);
        weapon = new Katana("Katana", 5, 5);
    }

    @Test
    void modifierStrength() {
        assertEquals(1, weapon.modifier(strength));
    }
    @Test
    void modifierDexterity() {
        assertEquals(2, weapon.modifier(dexterity));
    }
}