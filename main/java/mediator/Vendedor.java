package mediator;

public interface Vendedor {
    String receberReclamacao(String mensagem);
    String receberSugestao(String mensagem);
    String receberDuvida(String mensagem);
}
