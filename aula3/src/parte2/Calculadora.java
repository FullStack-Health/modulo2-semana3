package parte2;

public class Calculadora {

    // mesmo nome de método porém numero de parametros diferentes
    // soma(int, int) -> assinatura do método
    public int soma(int numero1, int numero2){
        return numero1+numero2;
    }

    // soma(int, int, int) -> assinatura do método
    public int soma(int numero1, int numero2, int numero3){
        return numero1+numero2+numero3;
    }

    // soma(double, double) -> assinatura do método
    public double soma(double numero1, double numero2){
        return numero1+numero2;
    }

    // soma(double, double, int) -> assinatura do método
    public double soma(double numero1, double numero2, int numero3){
        return numero1+numero2+numero3;
    }

    public double soma(double[] numero1 ){
        return numero1[0]+numero1[1]+numero1[3];
    }
}
