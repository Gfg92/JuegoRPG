
import Character.Race.Elf;
import Character.Race.Human;
import Character.Race.Orc;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;

public class Main {
    public static void main(String[] args) {
        Constitution constitution = new Constitution(5);
        System.out.println(constitution.toString());

        Strength strength = new Strength(8);
        System.out.println(strength.toString());
        strength.increase();
        System.out.println(strength.toString());

        Dexterity dexterity = new Dexterity(5);

        Intelligence intelligence = new Intelligence(0);


        Human human = new Human();
        System.out.println(human.modifier(strength) + human.modifier(constitution) + human.modifier(dexterity));

        Orc orc = new Orc();
        System.out.println(orc.modifier(strength) + orc.modifier(constitution) + orc.modifier(intelligence));

        Elf elf = new Elf();
        System.out.println(elf.modifier(dexterity) + elf.modifier(intelligence) + elf.modifier(constitution));


    }
}


