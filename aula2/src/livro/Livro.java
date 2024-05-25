package livro;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    private String autor;
    private String  editora;
    private int anoPublicacao;
    private double valor;
    private List<String> idiomas; // objeto, porém ele não tem código para executar

    private static int contadorLivros = 0;

    // Construtor vazio ou padrão
    // todos os construtores tem o nome da Classe mais o ()
    // podemos executar código dentro dos construtores
    // pode private, protecte, defaul ou public
    // esse construtor sobreescreve o construtor padrão de todas as classes
    public Livro(){
        this.idiomas = new ArrayList<>(); // adicionando o código de ArrayList na List
                                            // coloco os campos e métodos de ArrayList em idioma

            // posso alterar os valores dos atributos da classe no construtor
        this.autor = "";
        this.editora = "";

        // posso usar o construtor padrão para adicionar valores
        // ou fazer lógicas ao criar um novo objeto
        System.out.println("Novo livro.Livro!");
        contadorLivros++;
    }

    public void printList(){
        System.out.println(idiomas);
    }

    protected void protecPrint(){
        System.out.println("Protect");
    }

    void defaultPrint(){
        System.out.println("Default");
    }

    private void privatePrint(){
        System.out.println("Default");
    }

}

// TODO
//  verificar
//  lista de tarefas