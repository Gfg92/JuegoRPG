package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.*;

public class Character {
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
        return (dexterity.getValue() + getRace().modifier() + getJob().modifier()) * 2;
    }

    // (valor base Strength + bonif. raza + bonif. profesion) * 2
    public double power() {
        return (strength.getValue() + getRace().modifier() + getJob().modifier()) * 2;
    }

    // (valor base Intelligence + bonif. raza + bonif. profesion) * 2
    public double magic() {
        return (intelligence.getValue() + getRace() + getJob().modifier()) * 2;
    }

    // (valor base Constitution + bonif. raza + bonif. profesion) * 25
    public double health() {
        return (constitution.getValue() + getRace().modifier() + getJob().modifier()) * 25;
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
                " and Helath: " + health();
    }
}
