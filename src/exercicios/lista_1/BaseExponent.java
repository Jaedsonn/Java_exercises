package exercicios.lista_1;

import java.util.Scanner;


public class BaseExponent {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Vamos usar potenciação!");

        System.out.print("Me dê a base: ");
        double base = io.nextDouble();


        System.out.print("Me dê o expoente: ");
        double expoente = io.nextDouble();

        System.out.println(base + " Elevado a " + expoente + " é igual a " + (Math.pow(base, expoente)));
    }
}
