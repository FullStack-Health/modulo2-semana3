package livro;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    // Construtor com paramentros
    // permite adicionar valore a um objeto logo que ele é criado
    // quando criarmos um unico construtor o contrutor padrão de todas as classes deixa de existir
    public Pessoa(String nome, int idade, double altura){
        // é necessário atribuir os valore recebido as variáveis
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }
    public Pessoa(){}
}
