package exercicios.lista_6;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

    public static void main(String[] args) {
        List<Integer> lista_ecadeada = new LinkedList();
        lista_ecadeada.add(1);
        lista_ecadeada.add(6);
        lista_ecadeada.add(5);
        lista_ecadeada.add(4);
        lista_ecadeada.add(3);

        System.out.println(lista_ecadeada);
        lista_ecadeada.add(2, 50);
        System.out.println(lista_ecadeada);
    }
}