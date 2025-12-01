package mediator;

public class Usuario {
    public String enviarReclamacao(String mensagem) {
        return Mediador.getInstancia().receberReclamacaoLoja(mensagem);
    }

    public String enviarSugestao(String mensagem) {
        return Mediador.getInstancia().receberSugestaoLoja(mensagem);
    }

    public String enviarDuvida(String mensagem) {
        return Mediador.getInstancia().receberDuvidaLoja(mensagem);
    }
}
