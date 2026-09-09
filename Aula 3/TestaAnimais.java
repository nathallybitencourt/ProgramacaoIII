public class TestaAnimais {

    public static void main(String[] args) {
        Animal[] animais = new Animal[2];
        animais[0] = new Cachorro();
        animais[1] = new Gato();

        for (Animal a : animais) {
            a.emitirSom(); 
        }
    }
}
