package Item;

import Character.CharacterPj;
import Character.Stat.Stat;

public interface IEquippable extends IPickable {
    //    BodyPart where();
    //    double weight;
    //    int modifier(Stat stat);

    void equippedBy(CharacterPj character);




}
