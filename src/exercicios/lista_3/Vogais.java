package exercicios.lista_3;

import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Scanner;

public class Vogais {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Contar vogais de uma palavra");
        System.out.print("Palavra: ");

        String palavra = io.next();
        String[] palavraSeparada = palavra.split("");

        int vogaisNum = 0;
        String[] vogais = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < palavraSeparada.length; i++) {
            for (int j = 0; j < vogais.length - 1; j++) {

                if (Objects.equals(palavraSeparada[i], vogais[j])) {
                    vogaisNum++;
                }
            }
        }

        System.out.println("O número de vogais nesta palavra é " + vogaisNum);

    }
}
