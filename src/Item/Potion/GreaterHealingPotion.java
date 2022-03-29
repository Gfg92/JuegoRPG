package Item.Potion;
import Character.CharacterPj;

public class GreaterHealingPotion extends Potion{
    public GreaterHealingPotion(){
        super(100);
    }

    @Override
    public void pickedBy(CharacterPj character) {
        character.pickUp(this);
    }
}
