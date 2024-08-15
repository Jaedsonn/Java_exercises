package exercicios.lista_2;

import java.util.Scanner;

public class Classificador {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Classificador de notas");
        System.out.println("-".repeat(20));
        System.out.print("Nota: ");
        int nota = io.nextInt();

        if (nota >= 90) {
            System.out.println("Aprovado com distinção!");
        } else if (nota >= 60 && nota < 90) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado");
        }
    }
}
