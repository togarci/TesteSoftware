package src.main;
import static org.mockito.Mockito.*;

public class App {
    public static void main(String[] args) {
        Calculadora classMock = mock(Calculadora.class);
        when(classMock.subtracao(4, 2)).thenReturn(2);
        System.out.println(classMock.subtracao(4, 2));

    }

}
