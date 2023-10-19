import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
public class TestMain {
    @Test
    public void testGetStudentsWithLowAverage() {
        Map<String, Map<String, List<Integer>>> students = new HashMap<>();
        Main.fillStudentData(students);

        List<String> result = Main.getStudentsWithLowAverage(students);

        assertEquals(2, result.size());
        assertEquals("Ivanov", result.get(0));
        assertEquals("Petrov", result.get(1));
    }
}
