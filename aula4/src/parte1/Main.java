package parte1;

import parte1.entity.Funcionario;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Funcionario funcionario = new Funcionario("Jairo", 37, 3000.0);
        funcionario.printSalario();
//        funcionario.printNomeProtected(); // protected

        Chefe chefe = new Chefe();
        chefe.printSalario();
        chefe.printSuperNome(); // ele está chamando o método protected que se encontra na Classe Super(Funcionário) em um método public na Classe Sub(parte1.Chefe)

    }
}