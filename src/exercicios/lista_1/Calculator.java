package exercicios.lista_1;

import java.util.Scanner;

public class Calculator {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("-".repeat(20));
            System.out.println("Qual operação você deseja fazer? ");
            double option = getOption();
            if (option == 0) break;

            // Tipo de variável ficou double por opção
            // preferi usar no lugar do int por que fazia mas jus a funcionalidade de uma calculadora
            System.out.print("Digite o primeiro número: ");
            double firstDigit = io.nextDouble();

            System.out.print("Digite o segundo número: ");
            double secondDigit = io.nextDouble();

            double result = makeCount(firstDigit, secondDigit, option);

            System.out.println("Resultado da operação: " + result);

        }
    }

    private static double makeCount(double num1, double num2, double option) {
        if (option == 1) {
            return num1 + num2;
        }
        if (option == 2) {

            return num1 - num2;
        }

        if (option == 3) {

            return num1 * num2;
        }

        if (option == 4) {
            return (double) num1 / num2;
        }
        return 0;
    }

    private static int getOption() {
        System.out.println("0: Sair");
        System.out.println("1: Somar");
        System.out.println("2: Subtrair");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");

        return io.nextInt();
    }
}
