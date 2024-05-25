public class Main3 {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            double resultado = a/b;

        } catch (ArithmeticException e){ // Exception é a Classe pai de todos os erros
            System.out.println("ArithmeticException");
            System.out.println(e.getMessage());

            throw e;
        } catch (Exception e){ // Exception é a Classe pai de todos os erros
            System.out.println("Exception");
            System.out.println(e.getMessage());

            throw e;
        }
    }
}
