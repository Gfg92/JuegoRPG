package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.*;

public class Character implements IDamageable {
    // Atributos
    private String name;
    private Race race;
    private Job job;
    private Strength strength = new Strength(5);
    private Dexterity dexterity = new Dexterity(5);
    private Constitution constitution = new Constitution(5);
    private Intelligence intelligence = new Intelligence(5);

    //Getters y Setters
    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public Job getJob() {
        return job;
    }

    // Constructor
    public Character(String name, Race race, Job job, Strength strength, Dexterity dexterity, Constitution constitution, Intelligence intelligence) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
    }

    // Metodos
    // (valor base Dexterity + bonif. raza + bonif. profesion) * 2
    public double velocity() {
        return (dexterity.getValue() + getRace().modifier(dexterity) + getJob().modifier(dexterity)) * 2;
    }

    // (valor base Strength + bonif. raza + bonif. profesion) * 2
    public double power() {
        return (strength.getValue() + getRace().modifier(strength) + getJob().modifier(strength)) * 2;
    }

    // (valor base Intelligence + bonif. raza + bonif. profesion) * 2
    public double magic() {
        return (intelligence.getValue() + getRace().modifier(intelligence) + getJob().modifier(intelligence)) * 2;
    }

    // (valor base Constitution + bonif. raza + bonif. profesion) * 25
    public double health() {
        return (constitution.getValue() + getRace().modifier(constitution) + getJob().modifier(constitution)) * 25;
    }


    // Metodos de la interface
    //Devuelve la vida máxima del personaje
    @Override
    public double maxHealth() {
        return 0;
    }

    //Devuelve el valor de vida actual
    @Override
    public double currentHealth() {
        return health();
    }

    //Devuelve true si el daño es mayor o igual a la vida
    @Override
    public boolean isDead() {
        int damage = 0;
        if (currentHealth() < damage) {
            return true;
        } else {
            return false;
        }
    }

    //Aumenta el daño recibido
    @Override
    public void receivesDamage(double amount) {
        double danyo = currentHealth() - amount;

        System.out.println(name + " received " + amount + " damage. Health:" + danyo + "/" + "250");
    }

    //Disminuye el daño recibido. El daño mínimo es 0
    @Override
    public void heals(double amount) {
        double danyo = currentHealth() + amount;
        System.out.println(name + " healed " + amount + " life. Health:" + danyo + "/" + "250");
    }


    // Imprimir
    @Override
    public String toString() {
        return "My name is " + name +
                ". I'm an " + race +
                " " + job +
                ". My stats are: Strength: " + strength +
                ", Dexterity: " + dexterity +
                ", Constitution: " + constitution +
                ", Intelligence: " + intelligence +
                ", Velocity: " + velocity() +
                ", Power: " + power() +
                ", Magic: " + magic() +
                " and Health: " + health();
    }


}
