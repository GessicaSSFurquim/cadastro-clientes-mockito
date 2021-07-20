package dao;

import modelo.Cliente;

import java.util.List;

public interface ClienteDAO {
    Cliente criar(Cliente cliente);
    Cliente procurarPorId(long id);
    List<Cliente> procurarTodos();
    Cliente alterar(Cliente cliente);
    Cliente excluir(Cliente cliente);
}
