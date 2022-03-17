package Item.Weapon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {
    Weapon weapon;
    @BeforeEach
    void setUp() {
        weapon = new Katana(" ", 0, 0);
    }

    @Test
    void comprobar (){
        assertEquals(20, weapon.getWeight());
        assertEquals(10, weapon.getValue());
    }

    @Test
    void getValue() {
    }

    @Test
    void getWeight() {
    }

    @Test
    void testToString() {
    }
}