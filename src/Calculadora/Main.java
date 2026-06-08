package Calculadora;

public class Main {
    public static void main(String[] args){
        var calculadora = new Operaciones();
        var result1 = calculadora.sum(1,1);
        System.out.println("El resultado es " + result1);

        var result2 = calculadora.sum(3.5,2.5);
        System.out.println("El resultado es " + result2);
    }
}
