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
    void get_Value_Stat() {
        int esperado = 2;
        assertEquals(esperado,stat.getValue());
    }

    @Test
    void increase_value_by1() {
        int actualValue = stat.getValue();
        stat.increase();
        assertEquals(actualValue + 1, stat.getValue());
    }

    @Test
    void decrease_value_by1() {
        int actualValue = stat.getValue();
        stat.decrease();
        assertEquals(actualValue - 1, stat.getValue());
    }

    @Test
    void testToString() {

    }
}