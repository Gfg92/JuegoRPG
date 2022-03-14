package Character;


import Character.Job.Job;
import Character.Job.JobMock;
import Character.Race.Race;
import Character.Race.RaceMock;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
    JobMock jobMock;
    RaceMock raceMock;
    Strength strength;
    Dexterity dexterity;
    Constitution constitution;
    Intelligence intelligence;
    Character character;

    @BeforeEach
    void setUp() {
        jobMock = new JobMock();
        jobMock.setModifier(0);
        raceMock = new RaceMock();
        raceMock.setModifier(0);
        strength = new Strength(5);
        dexterity = new Dexterity(5);
        constitution = new Constitution(5);
        intelligence = new Intelligence(5);
        character = new Character("Cadiel", raceMock, jobMock, strength, dexterity, constitution, intelligence);
    }

    @Test
    void getName() {
        String nombre = character.getName();
        assertEquals("Cadiel", nombre);
    }

    @Test
    void getRace() {
        Race race = character.getRace();
        assertEquals(race, raceMock);
    }

    @Test
    void getJob() {
        Job job = character.getJob();
        assertEquals(job, jobMock);
    }

    @Test
    void velocity() {
        int velocity = (dexterity.getValue() + raceMock.modifier(dexterity) + jobMock.modifier(dexterity)) * 2;
        assertEquals(velocity, character.velocity());
    }

    @Test
    void power() {
        int power = (strength.getValue() + raceMock.modifier(strength) + jobMock.modifier(strength)) * 2;
        assertEquals(power, character.power());
    }

    @Test
    void magic() {
        int magic = (intelligence.getValue() + raceMock.modifier(intelligence) + jobMock.modifier(intelligence)) * 2;
        assertEquals(magic, character.magic());
    }

    @Test
    void maxHealth() {
        int maxHealth = (constitution.getValue() + raceMock.modifier(constitution) + jobMock.modifier(constitution)) * 25;
        assertEquals(maxHealth, character.maxHealth());
    }
    @Test
    void currentHealth(){
        double damage = 10;
        character.receivesDamage(damage);
        double currentHealth = character.maxHealth() - damage;
        assertEquals(currentHealth, character.currentHealth());
    }

    @Test
    void isDead() {
        double damage = 10;
        character.isDead();
    }

    @Test
    void receivesDamage() {
    }

    @Test
    void heals() {
    }
}