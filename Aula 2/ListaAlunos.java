
import java.util.ArrayList;
import java.util.Iterator;

public class ListaAlunos {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();

        alunos.add("Nathally");
        alunos.add("Taina");
        alunos.add("Seonghwa");
        alunos.add("Chanyeol");
        alunos.add("Namjoon");

        System.out.println("Lista de alunos:");
        Iterator<String> it = alunos.iterator();
        while (it.hasNext()) {
            System.out.println("- " + it.next());
        }

        Iterator<String> it2 = alunos.iterator();
        while (it2.hasNext()) {
            if (it2.next().equals("Taina")) {
                it2.remove();
            }
        }

        System.out.println("\nLista atualizada após remover um nome:");
        Iterator<String> it3 = alunos.iterator();
        while (it3.hasNext()) {
            System.out.println("- " + it3.next());
        }
    }
}
