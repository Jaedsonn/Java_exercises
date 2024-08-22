package exercicios.lista_6;

public class VetorDeInteiros {

    public static void main(String[] args) {
        int[] inteiros = new int[10];
        inteiros[0] = 5;
        inteiros[1] = 53;
        inteiros[2] = 12;
        inteiros[3] = 43;
        inteiros[4] = 87;
        inteiros[5] = 12;
        inteiros[6] = 43;
        inteiros[7] = 54;
        inteiros[8] = 2;
        inteiros[9] = 10;

        int menorValor = 0;
        int maiorValor = 0;

        for (int i = 0; i < inteiros.length; i++) {

            if (inteiros[i] > maiorValor) {
                maiorValor = inteiros[i];
            }
            if (menorValor == 0) {
                menorValor = inteiros[0];
            }
            if (menorValor > inteiros[i]) {
                menorValor = inteiros[i];
            }

        }
        System.out.println(menorValor);
        System.out.println(maiorValor);
    }
}
