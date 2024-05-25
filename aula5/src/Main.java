import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("A", 1));
        pessoas.add(new Pessoa("B", 1));
        pessoas.add(new Pessoa("C", 1));
        System.out.println(pessoas);


        //adiciono um item a Lista
        // no projeto será uma Classe separada
        Pessoa pessoaNomeNaoRepetido = new Pessoa("AA", 1);

        // Stream é uma classe que todas as listas tem acesso
        // a Stream adiciona funcionalidades as Lista(List e Set)
        // lista.stream().funcionalidade
        boolean validaNomeDuplicado =
                pessoas.stream()
                        .filter(
                            // validação entre objeto é melhor usar equals
                            // lambda de validação
                            pessoa -> pessoa.getNome().equals(pessoaNomeNaoRepetido.getNome())
                        )
                        .findFirst()
                        .isEmpty();

        // tanto o -> indica lambdas
        // :: é um method reference -> referencia de um método,
        // que tenha um único parâmetro entrada de dados
        // ou não tem parâmetros
        List<String> nomesPessoas =
                pessoas.stream().map(

                        Pessoa::getNome // é igual a pessoa -> pessoa.getNome()
                ).toList();
        nomesPessoas.contains(pessoaNomeNaoRepetido.getNome()); // validação de nome alternativo

        nomesPessoas.forEach(
                nome -> System.out.println("Nome na lista: " + nome)
        );

        nomesPessoas.forEach(
                // faça um print para cada string que tem nessa lista
                System.out::println
        );

        // o Stream não retorna list
        // ele precisa ou do método toList()
        // ou do método .collect(Collectors.toList())

        if (validaNomeDuplicado) {
            pessoas.add(pessoaNomeNaoRepetido);
        }

        System.out.println("Pessoas após validação: " + pessoas);

        pessoas.forEach(pessoa -> System.out.println(pessoa.getNome()));
    }
}