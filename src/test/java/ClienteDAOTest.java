import dao.ClienteDAO;
import dao.ClienteMySQLDAO;
import modelo.Cliente;
import org.junit.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;

public class ClienteDAOTest {
    //Cria Mock da dependência
    ClienteMySQLDAO mockedCliente = mock(ClienteMySQLDAO.class);

    //Instancia a classe sendo testada passando a dependência Mockada
    Cliente cliente1 = new Cliente(1, "Maria", "Rua das Flores");
    Cliente cliente2 = new Cliente(2, "Joana", "Rua das Margaridas");
    Cliente cliente3 = new Cliente(3, "Carlos", "Rua das Acácias");

    @Test
    public void criacaoRetornaOMesmoCliente() {
        //chama o método sendo testado
        mockedCliente.criar(cliente1);
        mockedCliente.criar(cliente2);
        mockedCliente.criar(cliente3);

        //Verifica se o método da dependência foi chamado (incluindo o parâmetro exato)
        verify(mockedCliente).criar(cliente1);
        verify(mockedCliente).criar(cliente2);
        verify(mockedCliente).criar(cliente3);
    }

    @Test
    public void procuraClientePorId() {
        //chama o método sendo testado
        mockedCliente.procurarPorId(1);

        //Verifica se o método da dependência foi chamado (incluindo o parâmetro exato)
        verify(mockedCliente).procurarPorId(1);
    }

    @Test
    public void procuraTodosOsClientes() {
        //chama o método sendo testado
        mockedCliente.procurarTodos();

        //Verifica se o método da dependência foi chamado (incluindo o parâmetro exato)
        verify(mockedCliente).procurarTodos();
    }

    @Test
    public void alteracaoRetornaOMesmoCliente() {
        //chama o método sendo testado
        Cliente clienteAlterado = new Cliente(2, "Joana Maria", "Rua das Margaridas");
        mockedCliente.alterar(clienteAlterado);

        //Verifica se o método da dependência foi chamado (incluindo o parâmetro exato)
        verify(mockedCliente).alterar(clienteAlterado);
    }

    @Test
    public void exclusaoRetornaOMesmoCliente() {
        //chama o método sendo testado
        mockedCliente.excluir(cliente3);

        //Verifica se o método da dependência foi chamado (incluindo o parâmetro exato)
        verify(mockedCliente).excluir(cliente3);
    }
}