package Character.Job;

import Character.Stat.Stat;

public abstract class Job {
    public abstract int modifier(Stat stat);

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
