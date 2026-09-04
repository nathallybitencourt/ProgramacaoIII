import java.util.ArrayList;
import java.util.Iterator;

public class CadastroPessoa {

  static boolean validarNome(String nome) {
    if (nome == null) {
      return false;
    }
    String tratado = nome.trim();
    return tratado.length() >= 3;
  }

  static boolean buscarNome(ArrayList<String> lista, String busca) {
    Iterator<String> it = lista.iterator();
    while (it.hasNext()) {
      if (it.next().equalsIgnoreCase(busca)) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    ArrayList<String> nomes = new ArrayList<>();

    String nome1 = "Nathally";
    String nome2 = "Hoseok";
    String nome3 = "Mingi";
    String nome4 = " Baekhyun ";

    if (validarNome(nome1)) nomes.add(nome1.trim());
    if (validarNome(nome2)) nomes.add(nome2.trim());
    if (validarNome(nome3)) nomes.add(nome3.trim());
    if (validarNome(nome4)) nomes.add(nome4.trim());

    System.out.println("Nomes cadastrados:");
    for (String n : nomes) {
      System.out.println("- " + n);
    }

    String busca = "mingi";
    if (buscarNome(nomes, busca)) {
      System.out.println("Usuario \"" + busca + "\" encontrado.");
    } else {
      System.out.println("Usuario \"" + busca + "\" não encontrado.");
    }
  }
}
