package Item;
import Character.CharacterPj;


public interface IEquippable extends IPickable {
    void equippedBy(CharacterPj character);
}
