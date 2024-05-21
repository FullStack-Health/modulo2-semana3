import entity.Predio;

public class Hotel extends Predio {

    String enderecoHotel = super.endereco;
    // endereço em um software produtivo não poderia ser protected
    // ele tem que ser private pelo principio de Encapsulamento
    // é possível, mas não desejável

    public String valorEndereco(String end){
        super.endereco = end;
        // o protected permite que eu acesse o endereço,
        // mesmo ele estando em outro pacote

        return super.endereco;
    }

    public void printPredio(){
        super.testProt();
        // o protected permite que eu acesse o testProt(),
        // mesmo ele estando em outro pacote
    }
}
