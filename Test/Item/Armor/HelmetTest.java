package Item.Armor;

import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelmetTest {
    Strength strength;
    Dexterity dexterity;
    Intelligence intelligence;
    Helmet helmet;

    @BeforeEach
    void setUp() {
        strength = new Strength(5);
        dexterity = new Dexterity(2);
        intelligence = new Intelligence(3);
        helmet = new Helmet("Helmet", 5, 10);
    }

    @Test
    void modifierStrength() {
        assertEquals(2, helmet.modifier(strength));
    }
    @Test
    void modifierDexterity() {
        assertEquals(2, helmet.modifier(dexterity));
    }
    @Test
    void modifierIntelligence() {
        assertEquals(1, helmet.modifier(intelligence));
    }
}