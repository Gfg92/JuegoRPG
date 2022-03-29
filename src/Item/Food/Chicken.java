package Item.Food;
import Character.CharacterPj;
public class Chicken extends Food{
    public Chicken() {
        super(25);
    }

    @Override
    public void pickedBy(CharacterPj character) {
        character.pickUp(this);
    }
}
