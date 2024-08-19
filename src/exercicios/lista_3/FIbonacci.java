package exercicios.lista_3;

import java.util.Scanner;

public class FIbonacci {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ester são todos os números menores que 100 da sequência de Fibonacci");
        int first = 0;
        int next = 1;

        for (int i = 0; i < 100; i++) {
            if(first + next > 100){
                return;
            }
            System.out.println(first + next); // 2
            next = first + next;  // 2
            first = next - first;  // 1
        }
    }
}
