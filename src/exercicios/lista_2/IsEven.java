package exercicios.lista_2;

import java.util.Scanner;

public class IsEven {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Me dê um número: ");
        int num = io.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " é par!");
            return;
        }
        System.out.println(num + " é ímpar");
    }
}
