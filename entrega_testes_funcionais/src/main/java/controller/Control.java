package controller;

import model.Aluguel;
import java.util.Scanner;

public class Control{
    public Scanner scan;
    public Aluguel alug;

    public Control(){
        scan = new Scanner(System.in);
        alug = new Aluguel();
    }

    public int inputInt(){
        int inteiro = scan.nextInt();
        return inteiro;        
    }

    public float inputFloat(){
        float nom = scan.nextFloat();
        return nom;
    }

    @Override
    protected void finalize() throws Throwable{
        scan.close();
    }
}