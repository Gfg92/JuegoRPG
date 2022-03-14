package Character;

import Character.Job.Assassin;
import Character.Job.Job;
import Character.Job.Mage;
import Character.Race.Elf;
import Character.Race.Human;
import Character.Race.Race;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ScheduledExecutorService;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
    Human human = new Human();
    Mage mage = new Mage();
    Elf elf = new Elf();
    Assassin assassin = new Assassin();
    Strength strength = new Strength(5);
    Dexterity dexterity = new Dexterity(5);
    Constitution constitution = new Constitution(5);
    Intelligence intelligence = new Intelligence(5);

    Character character = new Character("Caudiel", elf, assassin, strength, dexterity, constitution, intelligence);
    @BeforeEach
    void setUp() {

    }

    @Test
    void getName() {
        String nombre = character.getName();
        assertEquals("Caudiel", nombre);
    }

    @Test
    void getRace() {
        Race race = character.getRace();
        assertEquals(elf, race);
    }

    @Test
    void getJob() {
        Job job = character.getJob();
        assertEquals(assassin, job);
    }

    @Test
    void velocity() {
        assertEquals(22, character.velocity());
    }

    @Test
    void power() {
        assertEquals(12, character.power());
    }

    @Test
    void magic() {
        assertEquals(16, character.magic());
    }

    @Test
    void health() {
        assertEquals(125, character.health());
    }

    @Test
    void testToString() {
        assertEquals("My name is Caudiel. I'm an Character.Race.Elf@62e136d3 Character.Job.Assassin@c8e4bb0. My stats are: Strength: 5, Dexterity: 5, Constitution: 5, Intelligence: 5, Velocity: 22.0, Power: 12.0, Magic: 16.0 and Helath: 125.0", character.toString());
    }
}