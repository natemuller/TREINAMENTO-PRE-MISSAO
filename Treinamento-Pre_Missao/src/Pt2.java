import java.util.ArrayList;

public class Pt2 {

    public static void main(String[] args) {
        
        ArrayList<String> codinomes = new ArrayList<String>();

        codinomes.add("Natan");
        codinomes.add("Felipe");
        codinomes.add("Luiz");
        codinomes.add("Gabriel");
        codinomes.add("Emile");
        codinomes.add("Natan");
        codinomes.add("Felipe");
        codinomes.add("Luiz");
        codinomes.add("Gabriel");
        codinomes.add("Emile");
        codinomes.add("Lisboa");
        codinomes.add("Lisboa");
        codinomes.add("Lisboa");
        codinomes.add("Silvio Santos");

        System.out.printf("Lista inteira com elementos repetidos:\n");

        for (int i = 0; i < codinomes.size(); i++) {
            System.out.println(" - " + codinomes.get(i));
        }

        for (int i = 0; i < codinomes.size(); i++) {
            for (int j = i + 1; j < codinomes.size(); j++) {
                if (codinomes.get(i).equals(codinomes.get(j))) {
                    codinomes.remove(j);
                    j--;
                }
            }
        }

        System.out.printf("Lista sem duplicatas:\n");

        for (int i = 0; i < codinomes.size(); i++) {
            System.out.println(" - " + codinomes.get(i));
        }

        if (codinomes.contains("Lisboa")) {
            int i = codinomes.indexOf("Lisboa");
            codinomes.set(i, "Valencia");
        }

        System.out.printf("Lista em ordem alfabetica:\n");

        codinomes.sort(null);

        for (int i = 0; i < codinomes.size(); i++) {
            System.out.println(" - " + codinomes.get(i));
        }

        codinomes.replaceAll();
    }
}
