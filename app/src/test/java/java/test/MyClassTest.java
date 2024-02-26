import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {
    @Test
    public void testAddition() {
        MyClass myClass = new MyClass();
        assertEquals(4, myClass.add(2, 2));
    }
}
