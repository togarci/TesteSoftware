package view;

import model.Aluguel;
import controller.Control;
import controller.Request;
import com.google.gson.Gson;


public class App {
    public static float setCalc(int dia, float valor_nominal){
        Gson gson = new Gson();
        Request request = new Request();
        Aluguel alug = new Aluguel();
        alug.setVlr(valor_nominal);
        alug.setDia(dia);
        String json = request.sendGET(alug);
        alug = gson.fromJson(json, Aluguel.class);
        return alug.getCalc();
    }
    public static void main(String[] args) {
        System.out.println("Thyago Odorico Garcia \n Este programa esta consumindo uma API(aluguebug) para uso de testes funcionais");
        
        Aluguel teste = new Aluguel();
        // Pegar valores para API;
        Control control = new Control();
        System.out.println("Valor Nominal: ");
        float valor_nominal = control.inputFloat();
        System.out.println("Dia: ");
        int dia = control.inputInt();
        System.out.println(setCalc(dia, valor_nominal));

    }

}
