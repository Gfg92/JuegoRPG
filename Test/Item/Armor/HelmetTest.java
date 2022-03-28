package Item.Armor;

import Character.Stat.Intelligence;
import Character.Stat.Stat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelmetTest {
    Stat stat;
    Helmet helmet;

    @BeforeEach
    void setUp() {
        stat = new Intelligence(5);
        helmet = new Helmet("Helmet", 5,10);
    }
    @Test
    void modifierIntelligence(){
        assertEquals(1, helmet.modifier(stat));
    }
}