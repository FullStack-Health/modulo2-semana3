package parte1.entity;

import java.util.ArrayList;

public class Calculadora {

    private double variave1;
    private double variave2;
    private double variave3;
    private ArrayList<Double> resultados;
    private static int contadorDeCalculadoras;

    public Calculadora(double variave1,
                       double variave2
    ) {
        this.variave1 = variave1;
        this.variave2 = variave2;

        resultados = new ArrayList<>();
        contadorDeCalculadoras++;
    }

//    public Calculadora(double variave1,
//                       double variave2,
//                       double variave3
//    ) {
//        this.variave1 = variave1;
//        this.variave2 = variave2;
//        this.variave3 = variave3;
//
//        resultados = new ArrayList<>();
//    }

    public Calculadora(double variave1,
                       double variave2,
                       double variave3
    ) {
        this(variave1, variave2);

        /* o this() adiciona o código abaixo ao construtor
           é uma forma de garatir que os atributos obrigatórios sempre sejam preenchidos
         this.variave1 = variave1;
         this.variave2 = variave2;

         resultados = new ArrayList<>();
         contadorDeCalculadoras++;

         */

        this.variave3 = variave3;
    }

    public static int getContadorDeCalculadoras(){
        return contadorDeCalculadoras; // método static não existe para o this
    }


}
