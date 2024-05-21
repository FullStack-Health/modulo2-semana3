package entity;


public class MainEntity {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.idade  =42;
        pessoa.nome = "Jairo";
        pessoa.endereco = "Rua das Lagrimas";

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.endereco);

//        Hotel -> não existe para o pacote, pois não podemos importar da Raiz/src
        Predio predio = new Predio();

        VeiculoPrivate veiculoPrivate = new VeiculoPrivate();

        veiculoPrivate.repassaPrivate();
            // tenho acesso apenas aos método não private no mesmo pacote
    }
}
