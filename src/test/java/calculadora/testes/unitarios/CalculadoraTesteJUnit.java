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
        assertEquals(10, calculadora.somar(11, 5));
    }

    @Test
    void testeSubtracao(){
        Calculadora calculadora = new Calculadora();
        assertEquals(9, calculadora.subtrair(10, 1));
        assertEquals(5, calculadora.subtrair(10, 7));
    }

    @Test
    void testeMultiplicacao (){
        Calculadora calculadora = new Calculadora();
        assertEquals(15, calculadora.multiplicar(5, 3));
        assertEquals(20, calculadora.multiplicar(5, 5));
    }

    @Test
    void testeDivisao (){
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.dividir(10,2));
        assertEquals(3, calculadora.dividir(6,0));
    }

    @Test
    void testePotencia(){
        Calculadora calculadora = new Calculadora();
        assertEquals(8, calculadora.potencia(2, 3));
        assertEquals(9, calculadora.potencia(3, 0));
    }
    @Test
    void testePotenciaExpoenteZero(){
        Calculadora calculadora = new Calculadora();
        assertEquals(9, calculadora.potenciaExpoenteZero(0, 0));
    }
}
