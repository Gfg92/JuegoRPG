package Item.Armor;
import Character.CharacterPj;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Helmet extends Armor{
    // Atributos
    private String name;

    // Constructor
    public Helmet(String name,int value, double weight) {
        super("Helmet",5,2);
    }

    // Metodos
    @Override
    public int modifier (Stat stat){
        int valor = 0;
        if(stat instanceof Strength){
            valor = 2;
        }
        else if (stat instanceof Dexterity){
            valor = 2;
        }
        else if (stat instanceof Intelligence){
            valor = 1;
        }
        return valor;
    }


}
