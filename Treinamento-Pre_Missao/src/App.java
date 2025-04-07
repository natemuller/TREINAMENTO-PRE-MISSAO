import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Random random = new Random();
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Natan");
        nomes.add("Felipe");
        nomes.add("Luiz");
        nomes.add("Gabriel");
        nomes.add("Emile");

        if (nomes.contains("Marselha")) {
            System.out.println("Marselha encontrado!\n");
        }

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(" - " + nomes.get(i));
        }

        nomes.add("Cortez");
        nomes.remove(random.nextInt(nomes.size()));

        System.out.printf("Infiltrado removido e novo membro adicionado:\n");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(" - " + nomes.get(i));
        }

        ArrayList<String> mensagensSecretas = new ArrayList<String>();
        mensagensSecretas.add("Peixe?");
        mensagensSecretas.add("De");   
        mensagensSecretas.add("Palito");   
        mensagensSecretas.add("De");   
        mensagensSecretas.add("Gosta"); 
        mensagensSecretas.add("Voce");  

        System.out.println("Ultima mensagem adicionada!:\n" + mesagensSecretas.get(mensagensSecretas.size() - 1));

        System.out.printf("Todas as mensagens na ordem inversa:\n");

        for (int i = mensagensSecretas.size() - 1; i >= 0; i--) {
            System.out.println(" - " + mensagensSecretas.get(i));
        }

    }
}
