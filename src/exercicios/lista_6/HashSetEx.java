package exercicios.lista_6;
import java.util.Set;
import java.util.HashSet;

public class HashSetEx {

    public static void main(String[] args){
        Set nomes = new HashSet<String>();
        nomes.add("José");
        nomes.add("João");
        nomes.add("Julia");
        nomes.add("Juca");
        nomes.add("Juliana");

        System.out.println("Jaedson está na lista? " + nomes.contains("Jaedson"));
        System.out.println("Julia está na lista? " + nomes.contains("Julia"));
    }
}
