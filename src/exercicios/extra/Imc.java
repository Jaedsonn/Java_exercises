package exercicios.extra;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Imc {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Vamos calcular o IMC!");
        System.out.println("-".repeat(20));

        System.out.print("Seu peso: ");
        double peso = io.nextDouble();

        System.out.println("Sua altura em m: ");
        double altura = io.nextDouble();

        ClassificarImc(MakeCount(peso, altura));
    }


    private static double MakeCount(double peso, double altura) {
        return (peso / (altura * altura));
    }

    private static void ClassificarImc(double imc) {

        String numFormated = String.format("%.2f", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso: " + numFormated);
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal: " + numFormated);
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso " + numFormated);
        } else {
            System.out.println("Obesidade: " + numFormated);
        }
    }
}
