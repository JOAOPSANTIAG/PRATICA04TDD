package pratica04;

import static org.junit.Assert.*;
import org.junit.Test;

class CalculadoraFatorialTest {

    @Test
    void testFatorial() {
    	Fatorial_calculadora calc = new Fatorial_calculadora();
        assertEquals(120, calc.fatorial(5));
    }
}

