package exercicios.lista_1;

import java.util.Scanner;

public class CastingToString {

    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Me dê um decimal:  ");
        double decimal = io.nextDouble();

        String toString = String.valueOf(decimal);
        System.out.println("Tome uma String: " + toString);
    }
}
