package exercicios.lista_2;

import java.util.Scanner;

public class Calculator {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("-".repeat(20));
            System.out.println("Qual operação você deseja fazer? ");
            int option = getOption();
            if (option == 0) break;

            System.out.print("Digite o primeiro número: ");
            double firstDigit = io.nextDouble();

            System.out.print("Digite o segundo número: ");
            double secondDigit = io.nextDouble();

            double result = makeCount(firstDigit, secondDigit, option);

            System.out.println("Resultado da operação: " + result);

        }
    }

    private static double makeCount(double num1, double num2, int option) {
        switch (option) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                return num1 / num2;
            default:
                return 0;
        }
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
