package exercicios.lista_3;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Palindromo {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Verifique se a palavra é um palíndromo");
        System.out.print("Palavra: ");

        String palavra = io.next();

        //TODO: inverter a string, para poder verificar se é um palíndromo
        String[] palavraArr = palavra.split("");
        String[] palavraInvertida = new String[palavraArr.length];
        
        
        int right = 0;
        int left = palavraArr.length - 1;


        for (int i = 0; i <= palavraArr.length - 1; i++) {
            palavraInvertida[right] = palavraArr[left];
            left--;
            right++;
        }

        System.out.println(palavra + " = " + String.join("", palavraInvertida));
        if(palavra.equals(String.join("", palavraInvertida))){
            System.out.println("É um palíndromo!");
        } else{
            System.out.println("Não é um palíndromo...");
        }



    }
}

/*StringBuilder palavraInvertida = new StringBuilder(palavra).reverse();

        if (palavra.equals(palavraInvertida)) {
        System.out.println("É um palíndromo");
        } else {
                System.out.println("Não é um palíndromo");
        }*/
