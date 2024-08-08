package exercicios.lista_1;
import java.util.Scanner;

public class SquareCalc {
    private static final Scanner io = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Calculando área e perímetro de um retângulo");

        System.out.print("Me dê a largura: ");
        double largura = io.nextDouble();

        System.out.print("Me dê a altura: ");
        double altura = io.nextDouble();

        System.out.println("Área: " + (largura * altura));
        System.out.println("Perímetro: " + (largura*2 + altura*2));
    }
}
