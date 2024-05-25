package parte4;

public class Fatorial {

    public static long calculaFatorial(long numeroFatorial){
        System.out.println(numeroFatorial);
        if (numeroFatorial <= 1L){
            return 1;
        }
        return numeroFatorial* calculaFatorial(numeroFatorial-1);
    }

    // 5*calculaSequencia(4);
    // 4*calculaSequencia(3);
    // 3*calculaSequencia(2);
    // 2*calculaSequencia(1);

    // 5*calculaSequencia(4*calculaSequencia(3*calculaSequencia(2*calculaSequencia(1)))
    // 5*4*3*2*1

}
