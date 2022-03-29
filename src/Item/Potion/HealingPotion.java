package Item.Potion;
import Character.CharacterPj;

public class HealingPotion extends Potion{
    public HealingPotion(){
        super(50);
    }

    @Override
    public void pickedBy(CharacterPj character) {
        character.pickUp(this);
    }
}
