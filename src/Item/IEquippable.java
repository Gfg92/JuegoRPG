package Item;
import Item.*;
import Character.CharacterPj;
import Character.Stat.Stat;
import Item.Armor.Armor;

public interface IEquippable extends IPickable {
    //    BodyPart where();

    void equippedBy(CharacterPj character);

    void where(CharacterPj character);







}
