package exercicios.lista_5;

import java.util.Scanner;

public class Fatorial {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Digite um número: ");
        int num = io.nextInt();

        System.out.println("A fatorial de " + num + " é igual á " + fatora(num));
    }

    private static int fatora(int num) {
        int result = 1;

        for (int i = 1; i < num; i++) {
            if (result == 1) {
                result = num * 1;
            } else {
                result = result * i;
            }
        }
        return result;
    }
}
