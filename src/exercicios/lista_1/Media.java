package exercicios.lista_1;
import java.util.Scanner;

public class Media {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Vamos calcular a média entre 3 número!");

        System.out.print("Primeiro número: ");
        double firstDigit = io.nextDouble();

        System.out.print("Segundo número: ");
        double secondDigit = io.nextDouble();

        System.out.print("Terceiro número: ");
        double lastDigit = io.nextDouble();

        double med = (firstDigit + secondDigit + lastDigit) / 3;
        System.out.println("Média: " + med);
    }
}
