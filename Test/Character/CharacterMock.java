package Character;

import Character.Job.JobMock;
import Character.Race.RaceMock;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;

public class CharacterMock extends CharacterPj {
    public CharacterMock() {
        super("Pepito", new RaceMock(), new JobMock(), new Strength(10), new Dexterity(10), new Constitution(10), new Intelligence(10));
    }
}
