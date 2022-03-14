package Character.Race;

import Character.Stat.Stat;

public class RaceMock extends Race {
    private int modifier;

    @Override
    public int modifier(Stat stat) {
        return modifier;
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }
}
