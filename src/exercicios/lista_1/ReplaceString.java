package exercicios.lista_1;

import java.util.Scanner;

public class ReplaceString {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite uma frase: ");
        String frase = io.nextLine();

        System.out.println("Digite qual caracter você quer substituir: ");
        char ch = io.next().charAt(0);

        System.out.print("Digite o novo caracter: ");
        char newCh = io.next().charAt(0);

        System.out.print("Nova frase: " + replaceChars(frase, ch, newCh));
    }

    public static String replaceChars(String str, char ch, char newCh) {
        return str.replaceAll(String.valueOf(ch), String.valueOf(newCh));
    }
}
