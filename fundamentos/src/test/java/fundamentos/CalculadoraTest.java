package fundamentos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    Calculadora c;

    @BeforeEach
    public void setUp() {
        c = new Calculadora();
    }

    @Test
    public void testSoma() {
        assertEquals(0.82, c.soma(0.8, 0.02), 0.00000000000001);
    }

    @Test
    public void testSomaDecimal() {
        assertEquals(0.82, c.somaDecimal(0.8, 0.02), 0.0000000000000001);
    }


    @Test
    public void testDiv() {
        assertEquals(2.5, c.div(5, 2),0.0000000000000001);
    }

    @Test
    public void testDivZero() {
        assertThrows(ArithmeticException.class, () -> c.div(5, 0));
    }
}