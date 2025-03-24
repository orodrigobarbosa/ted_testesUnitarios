package calculadora.testes.unitarios;

import org.example.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTesteJUnit {
    private Calculadora calculadora;

    @Test
    void testeSoma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(3, calculadora.somar(1, 2));
        assertEquals(0, calculadora.somar(-1, 1));
    }

    @Test
    void testeSubtracao(){
        Calculadora calculadora = new Calculadora();
        assertEquals(9, calculadora.subtrair(10, 1));

    }
}
