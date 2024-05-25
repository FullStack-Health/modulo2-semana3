package parte3;

public class MainTryCatch {
    public static void main(String[] args) {

        try {
            parte3.Gato gato = new parte3.Gato();

            gato.setCorPelo("Laranja");
            gato.setCorPele("Branca");

            gato.printCorPele(); // chamando um método que dará erro de forma forçada

            System.out.println(gato);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
//            throw e;
            e.printStackTrace(); // stack trace é a pilha de execução do programa
                                // atua como um histórico da execução do programa
        }


    }
}
