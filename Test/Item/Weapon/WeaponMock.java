package Item.Weapon;

import Character.Stat.Stat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponMock {
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