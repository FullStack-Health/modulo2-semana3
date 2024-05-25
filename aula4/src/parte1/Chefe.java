package parte1;

import parte1.entity.Funcionario;

import java.util.List;

public class Chefe extends Funcionario {

    // o extends traz para dentro da Classe parte1.Chefe todos os métodos públicos e protected de Funcionário
    private double bonus;
    private List<Funcionario> liderados;


    // Se temos um construtor obrigatório na Super Classe
    // Temos que também um construtor na Sub Classe
    // Esse construtor tem que ter no mínimo todos os atributos do Construtor da Classe Pai/Super
    // esse construtor gera apenas 1 objeto
    public Chefe(String nome, int idade, double salario, double bonus) {
        super(nome, idade, salario);
        this.bonus = bonus;
    }

    public Chefe() {
        super("",0,0d);
    }

    public void printSuperNome(){
        // o super se refere a Classe Pai/Super Classe
        // o super é o this do Pai
        // o método é acessível por ser protected, pois se fosse private não poderia se acessado, e se fosse default ele só poderia se acessado no mesmo pacote
        super.printNomeProtected();

//        super.printNomeDefault(); // só da certo se a Classe parte1.Chefe estive no mesmo pacote que Funcionario
    }
}
