package parte2;

public class Main2 {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Gato gato = new Gato();

        animal.setNome("Garfield");
        animal.setIdade(4);
        animal.setCorPele("Rosa");

        gato.setCorPelo("Laranja");
        gato.setCorPele("Branca");

        animal.printCorPele();
        gato.printCorPele();

        System.out.println(animal); // o .toString é inferido ao fazer um print
        System.out.println(gato);

        animal.toString();// chamo o método sobreescrito
    }
}
