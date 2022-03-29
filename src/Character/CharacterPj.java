package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.*;
import Item.Armor.Armor;
import Item.IConsumable;
import Item.IEquippable;
import Item.IPickable;
import Item.Jewelry.Jewelry;
import Item.Weapon.Weapon;

import java.util.ArrayList;
import java.util.List;


public class CharacterPj implements IDamageable {
    // Atributos
    private String name;
    private Race race;
    private Job job;
    private Strength strength;
    private Dexterity dexterity;
    private Constitution constitution;
    private Intelligence intelligence;
    private double damage;
    private Weapon weapon;
    private Armor armor;
    private Jewelry jewelry;
    private List<IPickable>pickableList = new ArrayList<>();
    private List<IEquippable>equippableList = new ArrayList<>();




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
    public CharacterPj(String name, Race race, Job job, Strength strength, Dexterity dexterity, Constitution constitution, Intelligence intelligence) {
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

    // Metodos de la interface IDamageable
    // Devuelve la vida máxima del personaje
    @Override
    public double maxHealth() {
        return (constitution.getValue() + getRace().modifier(constitution) + getJob().modifier(constitution)) * 25;
    }

    //Devuelve el valor de vida actual
    @Override
    public double currentHealth() {
        return maxHealth() - damage;
    }

    //Devuelve true si el daño es mayor o igual a la vida
    @Override
    public boolean isDead() {
        if (currentHealth() <= damage) {
            return true;
        } else {
            return false;
        }
    }

    //Aumenta el daño recibido
    @Override
    public void receivesDamage(double amount) {
        damage += amount;
        if (damage > maxHealth()) {
            isDead();
            damage = maxHealth();
        }
        System.out.println(name + " received " + amount + " damage. Health:" + currentHealth() + "/" + maxHealth());
    }

    //Disminuye el daño recibido. El daño mínimo es 0
    @Override
    public void heals(double amount) {
        damage -= amount;
        if (damage < 0) {
            damage = 0;
        }
        System.out.println(name + " healed " + amount + " life. Health:" + currentHealth() + "/" + maxHealth());
    }

    // Metodos de la interface IConsumable
    public void consumes(IConsumable consumable) {
        System.out.println(name + " consumed: " + consumable);
        consumable.consumedBy(this);
    }

    // Metodos de la interface IPickable
    public void pickUp(IPickable pickable){
        pickableList.add(pickable);
    }

    // Metodos de la interface IEquippable
    public void equippabled(IEquippable equippable){
        equippableList.add(equippable);
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
                " and Health: " + maxHealth();
    }


}
