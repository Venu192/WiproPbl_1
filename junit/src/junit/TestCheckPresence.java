package junit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class TestCheckPresence {

    @Test
    void testCheckPresence() {

        DailyTasks obj = new DailyTasks();

        // Should return true
        assertTrue(obj.checkPresence("Java", "va"));

        // Should return false
        assertFalse(obj.checkPresence("Java", "xy"));
    }
}
