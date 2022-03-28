package Item.Jewelry;

import Character.Stat.Dexterity;
import Character.Stat.Stat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NecklaceTest {
    Stat stat;
    Jewelry jewelry;

    @BeforeEach
    void setUp(){
        stat = new Dexterity(5);
        jewelry = new Necklace("Necklace", 5, 10);
    }

    @Test
    void modifierDexterity() {
        assertEquals(1, jewelry.modifier(stat));
    }
}