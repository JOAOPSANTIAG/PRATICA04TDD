import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraFatorialTest {

    @Test
    void testFatorial() {
    	Fatorial_calculadora calc = new Fatorial_calculadora();
        assertEquals(120, calc.fatorial(5));
    }
}

