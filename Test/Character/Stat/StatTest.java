package Character.Stat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatTest {
    Stat stat;

    @BeforeEach
    void setUp() {
        stat = new StatMock(2);
    }

    @Test
    void getValue() {
    }

    @Test
    void increase() {
        int actualValue = stat.getValue();
        stat.increase();
        assertEquals(actualValue + 1, stat.getValue());
    }

    @Test
    void decrease() {
        int actualValue = stat.getValue();
        stat.decrease();
        assertEquals(actualValue - 1, stat.getValue());
    }

    @Test
    void testToString() {

    }
}