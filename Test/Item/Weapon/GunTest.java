package Item.Weapon;

import Character.Stat.Constitution;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GunTest {
    Constitution constitution;
    Intelligence intelligence;
    Weapon weapon;

    @BeforeEach
    void setUp() {
        constitution = new Constitution(5);
        intelligence = new Intelligence(2);
        weapon = new Gun("Gun", 5, 5);
    }

    @Test
    void modifierConstitution() {
        assertEquals(2, weapon.modifier(constitution));
    }

    @Test
    void modifierIntelligence() {
        assertEquals(1, weapon.modifier(intelligence));
    }
}