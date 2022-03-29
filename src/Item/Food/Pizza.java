package Item.Food;
import Character.CharacterPj;
public class Pizza extends Food{
    public Pizza() {
        super(50);
    }


    @Override
    public void pickedBy(CharacterPj character) {
        character.pickUp(this);
    }
}
