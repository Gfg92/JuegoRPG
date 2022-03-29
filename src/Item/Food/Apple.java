package Item.Food;
import Character.CharacterPj;

public class Apple extends Food{

    public Apple() {
        super(5);
    }

    @Override
    public void pickedBy(CharacterPj character) {
        character.pickUp(this);
    }
}
