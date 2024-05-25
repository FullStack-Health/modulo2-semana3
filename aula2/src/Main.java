import livro.Carro;
import livro.Livro;
import livro.Pessoa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Livro livro = new Livro();
            // o () indica a presença de um construtor
            // usa o construtor vazio/sem parametros que nós definimos

        livro.printList();
//        livro.defaultPrint();
//        livro.protecPrint();


        // objeto que nasce com informações
        Pessoa pessoa = new Pessoa("Alex",20,2);

        Carro carro = new Carro(); // criando um carro com um construtor padrão
                                    // construtor que não sofreu alteração
    }
}