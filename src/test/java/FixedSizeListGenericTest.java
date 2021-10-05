import fruit.Apple;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FixedSizeListGenericTest {
    private Apple a1,a2;
    private FixedSizeListGeneric<Apple> list;

    @BeforeEach
    void setup() {
        a1 = new Apple("Apfel 1", 10);
        a2 = new Apple("Apfel 2", 5);
        list = new FixedSizeListGeneric<>(2);
    }

    @Test
    void addToArray() {
        assertEquals(true,list.add(a1));
        assertEquals(true,list.add(a2));
        assertEquals(false,list.add(a2));
        assertEquals(2, list.size());
    }

    @Test
    void getElement() {
        assertEquals(true,list.add(a1));
        assertEquals(true,list.add(a2));
        assertEquals(false,list.add(a1));
        assertInstanceOf(Apple.class, list.get(0));
        assertInstanceOf(Apple.class, list.get(1));
        assertEquals("Apfel 1", list.get(0).getName());
        assertEquals("Apfel 2", list.get(1).getName());
        assertEquals(null, list.get(2));
        assertThrows(java.lang.NullPointerException.class, ()->{list.get(2).getName();});
    }
}
