package exercicios.lista_6;

public class CaculaMedia {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 5;
        numeros[1] = 10;
        numeros[2] = 5;
        numeros[3] = 15;
        numeros[4] = 20;

        int sum = 0;

        for (int num : numeros) {
            sum += num;
        }

        System.out.println("A média é " + calcularMedia(sum, numeros.length));
    }

    public static double calcularMedia(int sum, int len) {
        return sum / len;
    }
}
