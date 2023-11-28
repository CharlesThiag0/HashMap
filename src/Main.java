import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //criação
        Map<String, Integer> map = new HashMap<>();

        //adicionando pares chave-valor
        map.put("Cachorro", 1);
        map.put("Gato", 2);
        map.put("Rato", 3);

        //acessando um valor atraves da chave
        int valor = map.get("Rato");
        System.out.println("Valor da chave do Rato: " + valor);
        System.out.println("--------------------------------");

        //removendo
        map.remove("Cachorro");

        //interando sobre as chaves
        for (String chave : map.keySet()) {
            System.out.println("Chave: " + chave);
            System.out.println("Valor: " + map.get(chave));
        }
    }
}