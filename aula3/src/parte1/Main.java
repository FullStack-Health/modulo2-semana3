package parte1;

import parte1.entity.Calculadora;
import parte1.entity.Funcionario;
import parte1.entity.Livro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro(); // new indica o uso de um construtor, logo a criação de um objeto
//        livro.printInformacoes(); // método do objeto não aparece para a Classe

//        Livro.printContadorLivros(); // método da Classe não aparece para o objeto

        Livro livro2 = new Livro();

        Funcionario funcionario = new Funcionario("Melman");
        livro2 = funcionario.vendiLivro("Guerra dos mundos","Artur C Clarck");
        Funcionario funcionario1 = new Funcionario("Victor", 21, 2000.0);

        Calculadora calculadora = new Calculadora(1.10,4.41);
        Calculadora calculadoraTodasVariaveis = new Calculadora(1.10,4.41,10.10);

        System.out.println("Numero de Calculadoras: "+
                Calculadora.getContadorDeCalculadoras());


        LocalDate dataAtual = LocalDate.now(); // data atual da máquina
        LocalDate dataCriada = LocalDate.of(2024,10,10); // data atual da máquina

    }
}