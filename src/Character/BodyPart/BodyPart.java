package Character.BodyPart;

import Character.CharacterPj;
import Character.Job.Monk;
import Character.Race.*;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import Item.Armor.Armor;
import Item.IEquippable;
import Item.Jewelry.Jewelry;
import Item.Potion.MinorHealingPotion;
import Item.Potion.Potion;
import Item.Weapon.Gun;
import Item.Weapon.Weapon;

public class BodyPart {
    private CharacterPj character;
    private Weapon weapon;
    private Jewelry jewelry;
    private Armor armor;
    private Race race;

    public void enLasManos(Weapon weapon) {
        System.out.println("Equipado en las manos");
    }
    public void enElCuerpo(Jewelry jewelry){
        System.out.println("Equipado en el cuerpo");
    }
    public void enElCuerpo(Armor armor){
        System.out.println("Equipado en el cuerpo");
    }


    public static void main(String[] args) {
        Elf elf = new Elf();
        Monk monk = new Monk();
        Potion potion = new MinorHealingPotion();
        CharacterPj characterPj = new CharacterPj("Pepe", elf, monk, new Strength(5), new Dexterity(5), new Constitution(5), new Intelligence(5));
        BodyPart bodyPart = new BodyPart();
        bodyPart.enLasManos(bodyPart.weapon);
        bodyPart.enElCuerpo(bodyPart.armor);

        characterPj.consumes(potion);

    }
}


