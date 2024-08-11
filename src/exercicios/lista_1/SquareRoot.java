package exercicios.lista_1;
import java.util.Scanner;

public class SquareRoot {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Calcular raiz quadrada dê: ");
        double num = io.nextDouble();

        System.out.println("Resultado: " + (Math.sqrt(num)));
    }
}
