import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter(";|\\R");
            // permite mais de uma palavra no next()
            // o nextInt deixa uma quebra de linha pendente que deve ser tratada
        int selecao = 0;
        while (true) {

            System.out.println("""
                    Bem vindo ao sistema da Nutri vida mais.
                    Selecione uma das opções a seguir:
                    1 - Cadastrar um novo paciente;
                    2 - Listar todos os pacientes;
                    3 - Alterar informações do paciente;
                    4 - Mostrar informações de um paciente;
                    5 - Registrar atividade física para um paciente;
                    6 - Remover paciente.
                    Outro valor para parar a execução
                    """);
            selecao = Integer.parseInt(scanner.next());

            switch (selecao){
                case 1:
                    telaCadastro(scanner);
                    continue;
                case 2:
                    telaListarPacientes();
                    continue;
                case 3:
                    telaAlterarInformacoes(scanner);
                    continue;
                case 4:
                    telaInformacoPaciente(scanner);
                    continue;
                case 5:
                    telaAtividadeFisicaPaciente(scanner);
                    continue;
                case 6:
                    telaRemoverPaciente(scanner);
                    continue;
                default:
                    break;
            }
            break;

        }

    }
}