package exercicios.lista_6;
import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args){
        Map marca_nacionalide = new HashMap();
        marca_nacionalide.put("Ford", "EUA");
        marca_nacionalide.put("BMW", "Alemanha");
        marca_nacionalide.put("Renault", "França");
        marca_nacionalide.put("Hyundai", "Coreia do Sul");
        marca_nacionalide.put("Aliança Nissan-Renault", "Japão");

        marca_nacionalide.forEach((chave, valor) -> {
            System.out.println("A " + chave + " é da " + valor);
        });
    }
}
