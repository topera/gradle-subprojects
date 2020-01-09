import com.topera.ClassA;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTest {

    @Test
    public void testA() {
        assertEquals(ClassA.getValueA(), "A");
    }

    @Test
    public void testAB() {
        assertEquals(ClassA.getValueAB(), "AB");
    }

}
