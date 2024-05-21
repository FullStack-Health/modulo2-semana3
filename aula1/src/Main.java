import entity.Funcionario;
import entity.Predio;
//import entity.Pessoa; // por ser default Pessoa não pode ser importada para outro pacote

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Jairo");
        funcionario.salario = 2000.10; // acesso publico
        funcionario.endereco = "Rua dos Peixes";
            // tenho acesso a endereço pois ele é Public tanto para Pessoa quanto para Funcionário

        System.out.println(funcionario.retornaNome());
            // posso acessar o nome por estar em um método de Funcionario
        System.out.println(funcionario.retornaEndereco());
        System.out.println(funcionario.salario);
//        System.out.println(funcionario.idade);
            // não é possível acessar idade, pois é defaul e não está em método algum de Funcionário


        Predio predio = new Predio();
        // predio não tem acesso nem ao atributo, nem ao método
        // pois são protected

        Hotel hotel= new Hotel();
        hotel.printPredio();
        hotel.valorEndereco("Rua das Pipocas");
        // eu consigo acessar os métodos de Hotel,
        // que acessam os métodos e atributos de Predio
        // temos um acesso indireto
        // um acesso direto não é possível, pois são protected


    }
}