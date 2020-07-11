
package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import view.App;

public class AppTestCSVFile {

    @ParameterizedTest(name="Teste CT{index}AB => Valor_nominal = {1}, Dia = {0} e Resultado_Esperado = {3}")
    @CsvFileSource(resources="/testsFile.csv")
    public void calculaTestCSVFile(int dia, float valor_nominal, float delta, float resultado_esperado) {
        assertEquals(resultado_esperado, App.setCalc(dia, valor_nominal), 0.001);
    }
}