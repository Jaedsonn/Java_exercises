package exercicios.lista_1;

import java.util.Scanner;

public class NumCompare {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Vamos comparar número!");

        System.out.print("Primeiro número: ");
        double firstDigit = io.nextDouble();

        System.out.print("Segundo número: ");
        double secondDigit = io.nextDouble();

        if (firstDigit > secondDigit) {
            System.out.println(firstDigit + " é maior que " + secondDigit);
        } else {
            System.out.println((secondDigit + " é maior que " + firstDigit));
        }
    }
}
