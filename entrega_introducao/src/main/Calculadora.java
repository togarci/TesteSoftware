package src.main; 

// Classe criada para ser mockada 
public class Calculadora {
    public int soma( int x,  int y) {
        return (x + y);
    }

    public int subtracao( int x,  int y){
        System.out.print("Metodo a ser mocado");
        return 10;
    }
}