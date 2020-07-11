
package teste_api_aluguel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import view.App;

public class AppTestCSVString {

    @ParameterizedTest(name="Teste CT{index}AB => Valor_nominal = {1}, Dia = {0}, Resultado_Esperado = {3}")
    @CsvSource(value = {"0:50.00:0.001:-1.00",
        "31:50.00:0.001:-1.00",
        "1:50.00:0.001:45.00",
        "6:50.00:0.001:47.50",
        "11:50.00:0.001:50.0",
        "16:50.00:0.001:51.05",
        "2:50.00:0.001:45.00",
        "4:50.00:0.001:45.00",
        "5:50.00:0.001:45.00",
        "7:50.00:0.001:47.50",
        "9:50.00:0.001:47.50",
        "10:50.00:0.001:47.50",
        "12:50.00:0.001:50.00",
        "14:50.00:0.001:50.00",
        "15:50.00:0.001:50.00",
        "17:50.00:0.001:51.10",
        "29:50.00:0.001:51.70",
        "30:50.00:0.001:51.75",
        "1:0:0.001:0.0",
        "1:-0.01:0.001:-0.009000000000000001",
        "1:0.01:0.001:0.009000000000000001"
        }, delimiter=':')
    public void calculaTestCSVString(int dia, float valor_nominal, float delta, float resultado_esperado) {
        assertEquals(resultado_esperado, App.setCalc(dia, valor_nominal), 0.001);
    }
}