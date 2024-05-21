package entity;

// Herança
//  Funcionario é Filho e Pessoa é Pai
public class Funcionario extends Pessoa {

    public double salario;

    // metodo que acessa o valor de uma variável da classe Pai
    public String retornaNome(){
        return super.nome; // super = this da Classe Pai
    }

    public String retornaEndereco(){
        return super.endereco; // super = this da Classe Pai
    }

    public void setNome(String nome){
        super.nome = nome;
    }
}
