package exercicios.lista_6;

public class CaculaMedia {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 5;
        numeros[1] = 10;
        numeros[2] = 0;
        numeros[3] = 15;
        numeros[4] = 20;



        System.out.println("A média é " + calcularMedia(numeros));
    }

    public static double calcularMedia(int[] numeros) {
        int sum = 0;

        for (int num : numeros) {
            sum += num;
        }
        return sum / numeros.length;
    }
}
