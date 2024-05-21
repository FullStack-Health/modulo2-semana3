package exercicio3;

import java.util.Scanner;

public class MainEx3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta();

        System.out.println("Preencha as informações de Conta");
        System.out.println();
        System.out.println("Numero da Conta");
        conta.setNumeroConta(scanner.next());
        // o set atua de forma parecida com a adição de um valor a uma variável

        System.out.println();
        System.out.println("Nome do Correntista da Conta");
        conta.setNomeCorrentista(scanner.next());


        System.out.println();
        System.out.println("Saldo da Conta");
        conta.setSaldoConta(Double.parseDouble(scanner.next()));


        String opcao;

        while (true) {
            System.out.println();
            System.out.println("""
                    Escolhe uma das alternativas a seguir:
                    1 - Sacar
                    2 - Depositar
                    3 - Consultar Saldo
                    S - Sair do sistema
                    """);
            opcao = scanner.next();

            switch (opcao){
                case "1":
                    System.out.println("Digite o valor a sacar: ");
                    conta.sacar(Double.parseDouble(scanner.next()));
                    continue;
                case "2":
                    System.out.println("Digite o valor a depositar: ");
                    conta.depositar(Double.parseDouble(scanner.next()));
                    continue;
                case "3":
                    conta.imprimirSaldo();
                    continue;
                default:
                    break; // sai do switch case
            }
            break; // break do loop, ele para o loop do while true

        }
    }
}
