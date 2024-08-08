package exercicios.lista_1;

import java.util.Scanner;

public class UpperCaseStr {

    public static void  main(String[] args){
        Scanner io = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String str = io.nextLine();
        System.out.println("Tome ela em uppercase: " + str.toUpperCase());
    }
}
