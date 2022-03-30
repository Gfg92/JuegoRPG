package Item.Potion;

import Item.IConsumable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Character.CharacterPj;
import Character.CharacterMock;

import static org.junit.jupiter.api.Assertions.*;

class PotionTest {

    Potion potion;
    CharacterPj character;

    @BeforeEach
    void setUp() {
        potion = new PotionMock(25,5);
        character = new CharacterMock();
    }

    @Test
    void consumedBy() {
        character.receivesDamage(25);
        character.consumes(potion);
        assertEquals(character.currentHealth(), character.maxHealth());

    }

}