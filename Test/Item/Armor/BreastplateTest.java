package Item.Armor;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreastplateTest {
   Constitution constitution;
   Intelligence intelligence;
   Dexterity dexterity;
    Helmet helmet;

    @BeforeEach
    void setUp() {
        intelligence = new Intelligence(5);
        dexterity = new Dexterity(6);
        constitution = new Constitution(2);
        helmet = new Helmet("Helmet", 5,10);
    }
    @Test
    void modifierIntelligence(){
        assertEquals(1, helmet.modifier(intelligence));
    }
    @Test
    void modifierDexterity(){
        assertEquals(2, helmet.modifier(dexterity));
    }
    @Test
    void modifierConstitution(){
        assertEquals(0, helmet.modifier(constitution));
    }
}