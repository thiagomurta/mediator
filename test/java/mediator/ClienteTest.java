package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveSugestaoLoja(){
        Cliente cliente = new Cliente();
        assertEquals("A Loja recebeu seu contato e respondeu com a seguinte mensagem.\n" +
                        ">>>A loja vai procurar se aprimorar para a sugestão: Informações do produto muito pouco explicativo",
                cliente.enviarSugestao("Informações do produto muito pouco explicativo"));
    }

    @Test
    void deveReclamarLoja(){
        Cliente cliente = new Cliente();
        assertEquals("A Loja recebeu seu contato e respondeu com a seguinte mensagem.\n" +
                    ">>>A loja vai procurar se aprimorar para a reclamação: Pedido atrasou", cliente.enviarReclamacao("Pedido atrasou"));
    }

    @Test
    void deveEnviarDuvidaLoja(){
        Cliente cliente = new Cliente();
        assertEquals("A Loja recebeu seu contato e respondeu com a seguinte mensagem.\n" +
                    ">>>A loja dará um retorno o mais breve possível para a dúvida: Prazo de entrega?", cliente.enviarDuvida("Prazo de entrega?"));
    }

}