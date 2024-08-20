package exercicios.lista_5;

import java.util.Scanner;

public class IsPrime {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        int num = io.nextInt();

        ehPrimo(num);
    }

    private static void ehPrimo(int num) {
        int divisores = 0;


        for (int count = 1; count <= num; count++) {
            if (num % count == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }
}
