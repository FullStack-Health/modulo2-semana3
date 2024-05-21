import entity.VeiculoPrivate;

public class Carro extends VeiculoPrivate {

    String numeroPlaca = super.getPlaca();
        // não é recomendavel pois pode ser sobreecrito e causar confusão

    public void tesPrivate(){
        super.repassaPrivate();
        // repasse é o unico método que temos acesso a partir de carro
        // o método printPrivate e os atributos são inacessiveis fora da Classe VeiculoPrivate
    }
}
