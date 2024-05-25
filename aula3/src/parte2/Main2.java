package parte2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Main2 {
    public static void main(String[] args) {
//        Calculadora calculadora = new Calculadora();
//        System.out.println("Soma 1:" + calculadora.soma(1,2));
//        System.out.println("Soma 2:" + calculadora.soma(1,2,3));
//        System.out.println("Soma 3:" + calculadora.soma(1d,2d,3));
//        System.out.println("Soma 4:" + calculadora.soma(1.2,32.1));

        var cal = new Calculadora(); // só dentro de método funciona o var


        // LocalData e LocalDateTime, data e horas
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formatterTime =
                DateTimeFormatter.ofPattern("HH:mm:ss:SS");

        DateTimeFormatter dateTimeFormatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDate localDate = LocalDate.parse("10/11/2022", formatter);
        LocalDateTime localDateTime =
                LocalDateTime.parse("10/11/2022 10:25:10", dateTimeFormatter);

        System.out.println(localDate.format(formatter));
        System.out.println(localDateTime.format(dateTimeFormatter));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.format(formatterTime));

    }
}
