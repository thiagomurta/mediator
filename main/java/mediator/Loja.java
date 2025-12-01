package mediator;

public class Loja implements Vendedor{

    private static Loja instancia = new Loja();
    private Loja(){}
    public static Loja getInstancia(){
        return instancia;
    }
    @Override
    public String receberReclamacao(String mensagem) {
        return "A loja vai procurar se aprimorar para a reclamação: " + mensagem;
    }

    @Override
    public String receberSugestao(String mensagem) {
        return "A loja vai procurar se aprimorar para a sugestão: " + mensagem;
    }

    @Override
    public String receberDuvida(String mensagem) {
        return "A loja dará um retorno o mais breve possível para a dúvida: " + mensagem;
    }
}
