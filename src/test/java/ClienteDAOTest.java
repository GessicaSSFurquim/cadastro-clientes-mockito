import dao.ClienteDAO;
import dao.ClienteMySQLDAO;
import modelo.Cliente;
import org.junit.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;

public class ClienteDAOTest {

    @Test
    public void criacaoRetornaOMesmoCliente() {
        ClienteMySQLDAO mockedCliente = mock(ClienteMySQLDAO.class);

        Cliente cliente1 = new Cliente(1, "Maria", "Rua das Flores");
        Cliente cliente2 = new Cliente(2, "Joana", "Rua das Margaridas");

        //usando o mock object
        mockedCliente.criar(cliente1);
        mockedCliente.criar(cliente2);
        mockedCliente.procurarPorId(1);
        mockedCliente.procurarTodos();
        mockedCliente.alterar(1, "Maria", "Rua das Rosas");
        mockedCliente.excluir(2, "Joana", "Rua das Margaridas");


        //verificacoes
        verify(mockedCliente).criar(1, "Maria", "Rua das Flores");
        verify(mockedCliente).procurarPorId(1);
        verify(mockedCliente).procurarTodos();
        verify(mockedCliente).alterar(1, "Maria", "Rua das Rosas");
        verify(mockedCliente).excluir(2, "Joana", "Rua das Margaridas");
    }
}