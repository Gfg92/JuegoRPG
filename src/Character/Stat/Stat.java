package Character.Stat;

public abstract class Stat {
    //Atributos
    private int value;

    //Constructor
    public Stat(int value) {
        this.value = value;
    }

    public Stat() {}




    //Metodos
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
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
        return "Stat{" +
                "value=" + value +
                '}';
    }


}
