package model;

import com.google.gson.Gson;
import controller.Request;

public class Aluguel{
    public float valor_calculado;
    public float valor_nominal;
    public int dia;

    public void setVlr(float valor){
        this.valor_nominal = valor;
    }
    public float getVlrNom(){
        return this.valor_nominal;
    }

    public void setDia(int dia){
        this.dia = dia;
    }
    public int getDia(){
        return this.dia;
    }

    public float getCalc(){
        return this.valor_calculado;
    }
}