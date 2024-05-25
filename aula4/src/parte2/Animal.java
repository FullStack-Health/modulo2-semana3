package parte2;

public class Animal {
    private String nome;
    private int idade;
    private String corPele;


    public void printCorPele(){
        System.out.println("O Animal tem a pele de cor "+corPele);
    }


    // Todas as classes herdam de Object
    // Todas as classes tem o método toString()
    // Para mudar o que o método toString retorna
    // precisamos sobreescrever o método
    @Override
        // o @Override indica para o Java que estamos
        // sobreescrevendo um método da Classe Super
        // nesse caso o Super é a Classe Object que é uma classe interna do Java
        // É uma anotação do Java
    public String toString() {
        return "Nome :" + this.nome
                + ", Idade :" + this.idade
                + ", Cor Pele :" + this.corPele;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }
}
