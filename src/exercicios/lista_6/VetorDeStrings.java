package exercicios.lista_6;

public class VetorDeStrings {
    public static void main(String[] args){
        String[] palavras = new String[5];
        palavras[0] = "jaedson";
        palavras[1] = "maria";
        palavras[2] = "joao";
        palavras[3] = "edson";
        palavras[4] = "leticia";

        for(String palavra: palavras){
            System.out.println(palavra.toUpperCase());
        }
    }
}
