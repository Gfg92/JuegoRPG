package Item.Food;
import Character.CharacterPj;
public class Bread extends Food{

    public Bread() {
        super(10);
    }

    @Override
    public void pickedBy(CharacterPj character) {
        character.pickUp(this);
    }
}
