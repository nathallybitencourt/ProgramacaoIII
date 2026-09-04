public class AnalisadorTexto {
    public static void main(String[] args) {
        String frase = " Programacao Orientada a Objetos com Java ";

        String tratada = frase.trim();
        System.out.println("Frase sem espacos nas pontas: \"" + tratada + "\"");
        System.out.println("Quantidade de caracteres: " + tratada.length());
        System.out.println("Frase em maiusculas: " + tratada.toUpperCase());
        System.out.println("Substituindo Java: " + tratada.replace("Java", "Linguagem Java"));
        System.out.println("Caractere no indice 5: " + tratada.charAt(5));
    }
}
