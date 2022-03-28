package Item.Armor;

import Character.Stat.Stat;
import org.junit.jupiter.api.Test;


class ArmorMock {
    private int modifier;

    @Test
    int modifier(Stat stat) {
        return modifier;
    }

    public int getModifier(){
        return modifier;
    }
    public void setModifier(int modifier){
        this.modifier = modifier;
    }
}