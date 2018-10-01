package br.com.sistemadecadastro.dao;

import br.com.sistemadecadastro.domain.Cliente;

import java.time.LocalDate;
import java.util.List;


public interface ClienteDao {
    
	void save(Cliente cliente);

    void update(Cliente cliente);

    void delete(Long id);

    Cliente findById(Long id);

    List<Cliente> findAll();
    
    List<Cliente> findByNome(String nome);

}
