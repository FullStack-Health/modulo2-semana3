package parte1.entity;

import java.util.ArrayList;

public class Funcionario {

    private String nome; // item obrigatório
    private int idade; // item opcional
    private double salario; // item opcional
    private ArrayList<Livro> livrosVendidos;



    //   Funcionario(String, int, double) -> Assinatura
    // podemos ter quantos construtores precisarmos ter, contanto que tenham assinaturas diferentes
    public Funcionario(String nome, int idade, double salario) {
        this(nome);
            // só pode ser usado no inicio de um construtor
            // chamei um construtor dessa classe (Funcionario)
            //          para complementar um outro construtor
            // temos um objeto **this** do tipo Funcionario
            // os construtores se juntam
        // o this(String) é para reuso de um construtor em outro

        // adicionando valores ao objeto **this**
        this.idade = idade;
        this.salario = salario;
    }

    // Funcionario(String)
    public Funcionario(String nome) {
        this.nome = nome;
        this.livrosVendidos = new ArrayList<>();
    }

    //   Funcionario(String, int) -> Assinatura
    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.livrosVendidos = new ArrayList<>();
    }




//    public Funcionario() { --> Não é usado se tivermos campos obrigatórios
//        this.livrosVendidos = new ArrayList<>();
//    }

    public Livro vendiLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo);
        // podemos acessar o construtor que está como protected no mesmo pacote
        // igual a Default
        this.livrosVendidos.add(livro);

        return livro;
    }



}
