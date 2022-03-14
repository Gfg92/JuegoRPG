package Character.Stat;

public abstract class Stat {
    //Atributos
    private int value;

    //Constructor
    public Stat(int value) {
        this.value = value;
    }

    //Metodos
    public int getValue() {
        return value;
    }

    public void increase() {
        value += 1;
    }

    public void decrease() {
        value -= 1;
    }

    //Imprimir
    @Override
    public String toString() {
        return Integer.toString(value);
    }


}
