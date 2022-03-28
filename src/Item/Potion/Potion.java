package Item.Potion;
import Character.CharacterPj;



public abstract class Potion {
    private double power;

    public Potion(double power) {
        this.power = power;
    }

    public void consumedBy(CharacterPj character) {
        character.heals(power);
    }



    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
