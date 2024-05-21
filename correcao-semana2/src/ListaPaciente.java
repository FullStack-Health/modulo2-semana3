import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public class ListaPaciente {

    private static List<Paciente> pacientes;

    static {
        pacientes = new ArrayList<>();
    }

    public static List<Paciente> listarPaciente(){
        return pacientes;
    }

    public static Paciente buscaPorId(int id){
        return pacientes.get(id);
    }

    public static void adicionar(Paciente paciente){
        pacientes.add(paciente);
    }

    public static void remover(int id){
        pacientes.remove(id);
    }

    public static void altera(Paciente pacienteEntrada, int id){
        Paciente pacienteLista = pacientes.get(id);
        // ao alterar o pacienteLista eu altero esse paciente na memória,
        // sendo assim não precisao salvar o paciente novamente

        pacienteLista.peso = pacienteEntrada.peso;
        pacienteLista.altura = pacienteEntrada.altura;
        pacienteLista.pressaoArterialDiatolica = pacienteEntrada.pressaoArterialDiatolica;
        pacienteLista.pressaoArterialSistolica = pacienteEntrada.pressaoArterialSistolica;
        pacienteLista.frequenciaCardiaca = pacienteEntrada.frequenciaCardiaca;
        pacienteLista.dietaAlimentar = pacienteEntrada.dietaAlimentar;
    }

}
