import entities.Paciente;
import repository.ListaPaciente;

import java.util.List;
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
                    telaInformacaoPaciente(scanner);
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

    private static void telaRemoverPaciente(Scanner scanner) {
        System.out.println("Remover paciente");

        int id = telaGetId(scanner);

        ListaPaciente.remover(id);

        System.out.println("entities.Paciente removido");
    }

    private static void telaAtividadeFisicaPaciente(Scanner scanner) {
        System.out.println("Inserir atividade Física do paciente");

        int id = telaGetId(scanner);


        Paciente paciente = ListaPaciente.buscaPorId(id);

        System.out.println();
        System.out.println("Informe a atividade Fisica do entities.Paciente");

        String atividade = scanner.next();

        paciente.regitroAtiviadeFisica(atividade);
    }

    private static void telaInformacaoPaciente(Scanner scanner) {

        int id = telaGetId(scanner);

        System.out.println("Informações do paciente");
        Paciente paciente = ListaPaciente.buscaPorId(id);

       paciente.monitoramentoPaciente();


    }

    private static void telaAlterarInformacoes(Scanner scanner) {

        // criei um paciente(objeto) temporario
        // usado para trafegar os dados que queremos
        Paciente pacienteAlterado = new Paciente();
        int id = telaGetId(scanner);

        System.out.println();
        System.out.println("Altere o entities.Paciente");
        System.out.println();

        System.out.println("altura :");
        pacienteAlterado.altura = Double.parseDouble(scanner.next());

        System.out.println("pressaoArterialSistolica :");
        pacienteAlterado.pressaoArterialSistolica = Integer.parseInt(scanner.next());

        System.out.println("pressaoArterialDiatolica :");
        pacienteAlterado.pressaoArterialDiatolica = Integer.parseInt(scanner.next());

        System.out.println("frequenciaCardiaca :");
        pacienteAlterado.frequenciaCardiaca = Double.parseDouble(scanner.next());

        System.out.println("dietaAlimentar :");
        pacienteAlterado.dietaAlimentar = scanner.next();

        ListaPaciente.alterar(pacienteAlterado, id);

    }

    private static int telaGetId(Scanner scanner) {
        int id;
        telaListarPacientes();

        System.out.println("Informe o ID do entities.Paciente");
        id = Integer.parseInt(scanner.next());
        System.out.println();
        return id;
    }

    private static void telaAlterarInformacoes2(Scanner scanner) {
        telaListarPacientes();

        System.out.println();
        System.out.println("Informe o ID do entities.Paciente");
        int id = Integer.parseInt(scanner.next());
        System.out.println();


        Paciente pacienteAlterado = ListaPaciente.buscaPorId(id);


        System.out.println();
        System.out.println("Altere o entities.Paciente");
        System.out.println();

        System.out.println("dietaAlimentar :");
        pacienteAlterado.altura = Double.parseDouble(scanner.next());

        System.out.println("pressaoArtdietaAlimentar :");
        pacienteAlterado.pressaoArterialSistolica = Integer.parseInt(scanner.next());

        System.out.println("pressaoArtdietaAlimentar :");
        pacienteAlterado.pressaoArterialDiatolica = Integer.parseInt(scanner.next());

        System.out.println("freqdietaAlimentar :");
        pacienteAlterado.frequenciaCardiaca = Double.parseDouble(scanner.next());

        System.out.println("dietaAlimentar :");
        pacienteAlterado.dietaAlimentar = scanner.next();

        System.out.println("entities.Paciente alterado");
    }

    private static void telaListarPacientes() {

        System.out.println();
        System.out.println("Listagem de Pacientes");
        System.out.println();

        List<Paciente> pacientes = ListaPaciente.listarPaciente();
        for (Paciente paciente : pacientes) {
            System.out.println("ID  -  Nome");
            System.out.println(pacientes.indexOf(paciente) + "  -  " + paciente.nome);
        }

        System.out.println();

    }

    private static void telaCadastro(Scanner scanner) {

        Paciente paciente = new Paciente();
        System.out.println("Adicione informações do pacientes");
        System.out.println();

        System.out.println("nome :");
        paciente.nome = scanner.next();

        System.out.println("idade :");
        paciente.idade = scanner.nextInt();
        scanner.next();

        System.out.println("peso :");
        paciente.peso = Double.parseDouble(scanner.next());


        System.out.println("altura :");
        paciente.altura = Double.parseDouble(scanner.next());

        System.out.println("pressaoArterialSistolica :");
        paciente.pressaoArterialSistolica = Integer.parseInt(scanner.next());

        System.out.println("pressaoArterialDiatolica :");
        paciente.pressaoArterialDiatolica = Integer.parseInt(scanner.next());

        System.out.println("frequenciaCardiaca :");
        paciente.frequenciaCardiaca = Double.parseDouble(scanner.next());

        System.out.println("dietaAlimentar :");
        paciente.dietaAlimentar = scanner.next();

        ListaPaciente.adicionar(paciente);

        System.out.println();
        telaListarPacientes();
        System.out.println();

    }
}