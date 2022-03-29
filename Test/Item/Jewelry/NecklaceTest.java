package Item.Jewelry;

import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NecklaceTest {
    Strength strength;
    Dexterity dexterity;
    Jewelry jewelry;

    @BeforeEach
    void setUp(){
        strength = new Strength(5);
        dexterity = new Dexterity(3);
        jewelry = new Necklace("Necklace", 5);
    }

    @Test
    void modifierStrength() {
        assertEquals(1, jewelry.modifier(strength));
    }
    @Test
    void modifierDexterity() {
        assertEquals(1, jewelry.modifier(dexterity));
    }
}