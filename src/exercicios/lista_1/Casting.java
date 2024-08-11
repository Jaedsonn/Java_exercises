package exercicios.lista_1;

import java.util.Scanner;

public class Casting {

    private static Scanner print = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Me dê um decimal: ");
        double decimal = print.nextDouble();

        int inteiro = (int) decimal;
        System.out.println("Tome um inteiro: " + inteiro);
    }
}
