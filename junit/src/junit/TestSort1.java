package junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TestSort1 {

    @Test
    void testSortValues() {
        int[] input = {5, 2, 8, 1, 3};
        int[] expected = {1, 2, 3, 5, 8};

        assertArrayEquals(expected, Sort1.sortValues(input));
    }
}