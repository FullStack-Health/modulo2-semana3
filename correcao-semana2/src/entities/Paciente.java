package entities;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    public String nome;
    public int idade;
    public double peso;
    public double altura;
    public int pressaoArterialSistolica;
    public int pressaoArterialDiatolica;
    public double frequenciaCardiaca;
    public String dietaAlimentar;
    public ArrayList<String> atividadesFisicas;

    public void monitoramentoPaciente() {

        System.out.println(
                "** Informações do paciente **" +
                "\n Nome : " +
                         this.nome +
                "\n Idade : " +
                         this.idade +
                "\n Peso : " +
                         this.peso +
                "\n Altura : " +
                         this.altura +
                "\n Pressao Arterial Sistolica : " +
                         this.pressaoArterialSistolica +
                "\n Pressao Arterial Diatolica : " +
                         this.pressaoArterialDiatolica +
                "\n Frequencia Cardiaca : " +
                         this.frequenciaCardiaca +
                "\n Dieta Alimentar : " +
                         this.dietaAlimentar +
                "\n Lista de atividades físicas : "+
                        this.atividadesFisicas
        );

    }

    public void regitroAtiviadeFisica(String atividade) {
        atividadesFisicas.add(atividade);
    }
}
