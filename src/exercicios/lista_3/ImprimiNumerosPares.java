package exercicios.lista_3;

public class ImprimiNumerosPares {
    public static void main(String[] args){

        for(int i = 100; i > 0; i--){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
