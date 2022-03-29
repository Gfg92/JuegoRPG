package Item;

import Character.Stat.Stat;

public interface IEquippable extends IPickable{
    int modifier (Stat stat);
}
