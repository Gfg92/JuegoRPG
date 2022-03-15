package Character;

import Character.Job.Job;
import Character.Job.JobMock;
import Character.Race.Race;
import Character.Race.RaceMock;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;

public class CharacterMock extends CharacterPj {
    public CharacterMock() {
        super("Pepito", new RaceMock(), new JobMock(), new Strength(0), new Dexterity(0), new Constitution(0), new Intelligence(0));
    }
}
