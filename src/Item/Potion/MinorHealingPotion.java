package Item.Potion;
import Character.CharacterPj;

public class MinorHealingPotion extends Potion{
    public MinorHealingPotion(){
        super(25);
    }

    @Override
    public void pickedBy(CharacterPj character) {
        character.pickUp(this);
    }
}
