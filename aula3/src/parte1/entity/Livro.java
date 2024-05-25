package parte1.entity;

public class Livro {

    private String titulo;
    private String autor;
    private static int contadorLivros; // acessíveis por qualquer tipo de método

    public Livro(){ // subtitui o contrutor padrão com um construtor sem parametros que tem algum código
        // os construtores são para objetos, eles criam os objetos
        contadorLivros++;
    }

    protected Livro(String titulo, String autor) { // construtor com ambos os parâmetros parte1.entity.Livro
        this.titulo = titulo;
        this.autor = autor;
    }

    // O contrutor com parametros tem uma assinatura
    // a assinatura é composta do
    //      nome -> nome da classe
    //      parametros -> tipos e ordem dos parametros
    //        se eu tiver 2 construtores com numeros diferentes de parametros eles construtores diferentes
    public Livro(String titulo){
        this.titulo = titulo;
    }

    public static void printContadorLivros(){ // acessível por outros métodos
        System.out.println("Numero total de livros criados é "+contadorLivros);
//        printInformacoes(); // um método static apenas pode acessar outros métodos static
    }

    public void printInformacoes(){ // método do objeto
        System.out.println("Titulo :" + titulo);
        System.out.println("Autor :" + autor);

        printContadorLivros(); // posso acessar métodos static através de métodos normais
    }

}
