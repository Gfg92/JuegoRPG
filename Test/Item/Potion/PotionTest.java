package Item.Potion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Character.CharacterPj;
import Character.CharacterMock;

import static org.junit.jupiter.api.Assertions.*;

class PotionTest {

    Potion potion;

    @BeforeEach
    void setUp() {
        potion = new PotionMock(5);
    }

    @Test
    void consumedBy() {
        CharacterPj character = new CharacterMock();
        character.receivesDamage(25);
        character.consumes(potion);
        assertEquals(character.currentHealth(), character.maxHealth());

    }

}