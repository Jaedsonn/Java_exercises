package exercicios.lista_5;

import java.util.Scanner;

public class IsPar {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite um número: ");
        int num = io.nextInt();

        System.out.println("O número " + num + " é par? " + ehPar(num));
    }

    private static boolean ehPar(int num) {
        return num % 2 == 0;
    }
}
