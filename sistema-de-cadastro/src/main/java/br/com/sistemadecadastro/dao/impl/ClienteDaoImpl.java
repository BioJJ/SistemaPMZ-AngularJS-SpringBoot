package br.com.sistemadecadastro.dao.impl;

import java.time.LocalDate;
import java.util.List;

import br.com.sistemadecadastro.dao.AbstractDao;
import br.com.sistemadecadastro.dao.ClienteDao;
import br.com.sistemadecadastro.domain.Cliente;
import org.springframework.stereotype.Repository;



@Repository
public class ClienteDaoImpl extends AbstractDao<Cliente, Long> implements ClienteDao {

	public List<Cliente> findByNome(String nome) {
		
		return createQuery("select f from cliente f where f.nome like concat('%',?1,'%') ", nome);
	}
	
}
