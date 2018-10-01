package br.com.sistemadecadastro.service;

import br.com.sistemadecadastro.domain.Cliente;
import java.util.List;

public interface ClienteService {

    void salvar(Cliente cliente);

    void editar(Cliente cliente);

    void excluir(Long id);

    Cliente buscarPorId(Long id);

    List<Cliente> buscarTodos();

	List<Cliente> buscarPorNome(String nome);

	
}
