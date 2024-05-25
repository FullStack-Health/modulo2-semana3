package parte2;

public class Gato extends Animal {
    private String corPelo;

    @Override
    public void printCorPele(){
        System.out.println(
                "O Gato tem a pele de cor " + super.getCorPele()
                + ", e tem o pelo de cor " + this.corPelo
        );
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + super.getNome() + "';" +
                "idade='" + super.getIdade() + "';" +
                "corPele='" + super.getCorPele() + "';" +
                "corPelo='" + corPelo + '\'' +
                '}';
    }

//    @Override -> toString criado pelo intellij
//    public String toString() {
//        return "Gato{" +
//                "corPelo='" + corPelo + '\'' +
//                '}';
//    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
