package parte1.entity;

public class Funcionario {

    private String nome;
    private int idade;
    private double salario;


    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }


    public void printSalario() {
        System.out.println(
            "Salario do "
                    + nome
                    + " é "
                    + salario
        );
    }

    protected void printNomeProtected() {
        System.out.println(
                "O nome é "
                        + nome
        );
    }

    void printNomeDefault() {
        System.out.println(
                "O nome é "
                        + nome
        );
    }
}
