import com.topera.ClassA;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTest {

    @Test
    public void test() {
        assertEquals(ClassA.getValue(), "A");
    }

}
