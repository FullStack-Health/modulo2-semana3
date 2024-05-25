package parte1;

public class ChefeDeSecao extends Chefe {
    // parte1.ChefeDeSecao é sub Classe de Funcionario e parte1.Chefe, é uma soma de ambos

    public void printSuperNome() {
        super.printNomeProtected(); // super é Funcionario
        super.printSuperNome(); // super é parte1.Chefe
//        super.printNomeDefault();
        // Pacote precisa ser o mesmo para métodos Default
    }
}
