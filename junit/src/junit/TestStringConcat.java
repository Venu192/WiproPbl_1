package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestStringConcat {

    @Test
    void testDoStringConcat() {
        DailyTasks obj = new DailyTasks();

        String actual = obj.doStringConcat("Hello", "World");
        String expected = "Hello World";

        assertEquals(expected, actual);
    }
}
