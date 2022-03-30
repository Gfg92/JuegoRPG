package Item.Food;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Character.CharacterPj;
import Character.CharacterMock;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {
    Food food;
    CharacterPj character;
    @BeforeEach
    void setUp() {
        food = new FoodMock(25, 5);
        character = new CharacterMock();
    }

    @Test
    void consumedBy() {
        character.receivesDamage(25);
        character.consumes(food);
        assertEquals(character.currentHealth(), character.maxHealth());

    }
}