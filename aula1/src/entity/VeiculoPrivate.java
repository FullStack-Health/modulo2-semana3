package entity;

import java.time.LocalDate;

public class VeiculoPrivate {

    private String placa; // placa apenas existe para VeiculoPrivate
    // nós só podemos acessar atributos através de métodos
    // a boa prática é que por padrão todos os atributos sejam private

    private LocalDate anoFabricacao;

    // o método apenas existe para VeiculoPrivate
    // métodos private são para funcionalidades que apenas a classe usa
    private void printPrivate(){
        System.out.println("Classe Private");
    }

    // normalmente misturamos private com public
    public void repassaPrivate(){
        printPrivate();
    }

// Tanto o getter como o setter existem para export o atributo, sem ferir o Encapsulamento


    //Getter existe exclusivamente para retornar dados de um atributo
    // o nome é get+Atributo, no modelo camelCase
    public String getPlaca() {
        return placa;
    }

    // Setter é exclusivo para adicionar dados a um atributo
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // método para validação de um dado antes de salvá-lo
    public void validaESalvaPlaca(String placa){
        if (placa != null){
            setPlaca(placa);
        }
    }

}
