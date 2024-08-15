package exercicios.extra;

import java.util.Scanner;

public class IsPrime {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite um número e veja se é primo: ");
        double numero = io.nextDouble();
        boolean cond1 = numero % 2 != 0 && numero != 2;
        boolean cond2 = numero % 3 != 0 && numero != 3;
        boolean cond3 = numero % 5 != 0 && numero != 5;
        boolean cond4 = numero % 7 != 0 && numero != 7;

        if (cond1 && cond2 && cond3 && cond4) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }

    }
}

/*System.out.print("Digite um número e veja se é primo: ");
        double numero = io.nextDouble();
        int divisores = 0;


        for (int count = 1; count <= numero; count++) {
            if (numero % count == 0)
                divisores++;

            if (divisores == 2)
                System.out.println("É primo");
            else
                System.out.println("Não é primo");
        }*/

