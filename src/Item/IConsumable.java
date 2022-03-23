package Item;
import Character.CharacterPj;

public interface IConsumable {
    //Pasamos el personaje para poder actuar sobre él
    void consumedBy(CharacterPj character);

    void pickableBy()

    void pickableBy(CharacterPj character);
}
