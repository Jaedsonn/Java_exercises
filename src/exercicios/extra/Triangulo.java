package exercicios.extra;

import java.util.Scanner;

public class Triangulo {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Classificador de triângulos");
        System.out.println("-".repeat(20));

        System.out.print("Lado A: ");
        double ladoA = io.nextDouble();

        System.out.print("Lado B: ");
        double ladoB = io.nextDouble();

        System.out.print("Lado C: ");
        double ladoC = io.nextDouble();

        ClassficaTriangulos(ladoA, ladoB ,ladoC);

    }

    private static void ClassficaTriangulos(double a, double b, double c) {
        if (isValid(a, b, c)) {
            if (a == b && b == c) {
                System.out.println("Equilátero");
            } else if (a == b || b == c || c == a) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
            return;
        }
        System.out.println("Não é um triângulo");
    }

    private static boolean isValid(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
