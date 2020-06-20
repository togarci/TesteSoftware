package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;
import model.Aluguel;



public class Request{
    private static final String USER_AGENT = "CHROME";
    
    public static String toStr(String str){
        // Estruturar resultado para aplicar na conversao
        String retorno = "";
        for(int x = 0; x != str.length(); x++){
            if ((x == 1) || (x == 18)){
                retorno = retorno + "'";
            }else if((x != 1) && (x != 2) && (x != 18) && (x != 19)){
                retorno = retorno + str.substring(x, x+1);
            }
        }
        return retorno;
    }

    public static String sendGET(Aluguel objeto){
        String GET_URL = "https://aluguebug.herokuapp.com/calc?dados={%22valor_nominal%22:" + objeto.getVlrNom() + ",%22dia%22:" + objeto.getDia() + "}";
        
        // Pegar resultado da requisicao
        try {
            URL obj = new URL(GET_URL);
		    HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
		    connection.setRequestMethod("GET");
		    connection.setRequestProperty("User-Agent", USER_AGENT);
		    int responseCode = connection.getResponseCode();
            
            if (responseCode == HttpURLConnection.HTTP_OK) { // success
		    	BufferedReader entrada = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine = entrada.readLine();
                entrada.close();
                return toStr(inputLine.substring(1,inputLine.length()-1));
		    } else {
		    	return "GET request not worked";
		    }

        } catch (IOException e) {
            //TODO: handle exception
            return e.toString();
        }
		
	}
}