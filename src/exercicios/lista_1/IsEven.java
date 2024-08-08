package exercicios.lista_1;
import java.util.Scanner;
public class IsEven {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Verifique se o número é par: ");
        double num = io.nextDouble();
        if (num % 2 == 0) {
            System.out.print("É par");
        } else {
            System.out.print("Não é par");
        }
    }
}
