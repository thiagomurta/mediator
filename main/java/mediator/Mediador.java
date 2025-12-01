package mediator;

public class Mediador {
    private static Mediador instancia = new Mediador();

    private Mediador(){}

    public static Mediador getInstancia(){
        return instancia;
    }

    public String receberReclamacaoLoja(String mensagem){
        return "A Loja recebeu seu contato e respondeu com a seguinte mensagem.\n" +
                ">>>" + Loja.getInstancia().receberReclamacao(mensagem);
    }
    public String receberSugestaoLoja(String mensagem){
        return "A Loja recebeu seu contato e respondeu com a seguinte mensagem.\n" +
                ">>>" + Loja.getInstancia().receberSugestao(mensagem);
    }
    public String receberDuvidaLoja(String mensagem){
        return "A Loja recebeu seu contato e respondeu com a seguinte mensagem.\n" +
                ">>>" + Loja.getInstancia().receberDuvida(mensagem);
    }
}
