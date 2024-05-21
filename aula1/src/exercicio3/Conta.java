package exercicio3;

public class Conta {

    private String numeroConta;
    private String nomeCorrentista;
    private double saldoConta;

    public double depositar(double deposito){
        this.saldoConta+=deposito;
        return this.saldoConta;
    }

    public double sacar(double saque){
        this.saldoConta-=saque;
        return this.saldoConta;
    }

    public void imprimirSaldo(){
        System.out.println("Saldo da conta "+ numeroConta + " é igual a "+ this.saldoConta);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
}
