package exercicios.extra;

import java.util.Scanner;

public class IsPrime {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite um número e veja se é primo: ");
        double numero = io.nextDouble();
        int divisores = 0;


        for (int count = 1; count <= numero; count++)
            if (numero % count == 0)
                divisores++;

        if (divisores == 2)
            System.out.println("É primo");
        else
            System.out.println("Não é primo");
    }
}

