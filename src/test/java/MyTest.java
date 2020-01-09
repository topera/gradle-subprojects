import com.topera.ClassA;
import com.topera.ClassB;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTest {

    @Test
    public void testA() {
        assertEquals("A", ClassA.getValueA());
    }

    @Test
    public void testAB() {
        assertEquals("AB", ClassA.getValueAB());
    }

    @Test
    public void testABC() {
        assertEquals("ABC", ClassA.getValueA() + ClassB.getValueBC());
    }

}
