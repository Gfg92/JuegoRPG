package Item.Food;
import Character.CharacterPj;

public class Vegetables extends Food {
    public Vegetables() {
        super(1);
    }

    @Override
    public void pickedBy(CharacterPj character) {
        character.pickUp(this);
    }
}
