package fundamentos;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PilhaTest {
    
    Pilha p;

    @BeforeEach
    public void setUp() {
        p = new Pilha();
    }

    @Test
    public void testSize() {
        assertEquals(0, p.size());
        p.push("1");
        assertEquals(1, p.size());
    }    

    @Test
    public void testEmpty() {
        assertTrue(p.isVazia());
    }

    @Test
    public void testPush() {
        p.push("2");
        p.push("3");
        assertEquals(2, p.size());
    }
    
    @Test
    public void testPop() {
        p.push("1");
        p.pop();
        assertEquals(0, p.size());
        assertThrows(EmptyStackException.class, () -> p.pop());
    }
}
