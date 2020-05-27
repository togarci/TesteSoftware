package src.test;

import src.main.Calculadora;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LibTest {
    @Test public void testSoma(){
        Calculadora calc = new Calculadora();
        assertEquals(2, 2);
    }

    // Mock da classe de Calculadora
    @Test public void testSubtracao(){
        Calculadora classMock = mock(Calculadora.class);
        when(classMock.subtracao(4, 2)).thenReturn(2);
        assertEquals(2, classMock.subtracao(4, 2));
    }

    @Test public void testSubtracao1(){
        Calculadora classMock = mock(Calculadora.class);
        when(classMock.subtracao(4, 1)).thenReturn(3);
        assertEquals(3, classMock.subtracao(4, 1));
    }

}
