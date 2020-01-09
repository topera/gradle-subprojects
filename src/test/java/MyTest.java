import com.topera.ClassA;
import com.topera.ClassC;

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

    @Test
    public void testABC() {
        assertEquals(ClassA.getValueAB() + ClassC.getValue(), "ABC");
    }

}
