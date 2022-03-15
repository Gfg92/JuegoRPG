package Item.Food;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Character.CharacterPj;
import Character.CharacterMock;
import static org.junit.jupiter.api.Assertions.*;

class FoodTest {
    Food food;

    @BeforeEach
    void setUp() {
        food = new FoodMock(5);
    }
    @Test
    void consumedBy() {
        CharacterPj character = new CharacterMock();
        character.receivesDamage(25);
        character.consumes(food);
        assertEquals();

    }
}