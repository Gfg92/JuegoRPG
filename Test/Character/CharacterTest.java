package Character;

import Character.Race.Elf;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
    Character character = new Character("Caliel", getRace(), getJob(), );
    @BeforeEach
    void setUp() {

    }

    @Test
    void getName() {

        assertEquals("Caliel", getName());
    }

    @Test
    void getRace() {
    }

    @Test
    void getJob() {
    }

    @Test
    void velocity() {
    }

    @Test
    void power() {
    }

    @Test
    void magic() {
    }

    @Test
    void health() {
    }

    @Test
    void testToString() {
    }
}