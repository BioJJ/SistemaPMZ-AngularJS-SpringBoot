package br.com.sistemadecadastro.service.impl;

import java.util.List;
import br.com.sistemadecadastro.dao.ClienteDao;
import br.com.sistemadecadastro.domain.Cliente;
import br.com.sistemadecadastro.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteDao dao;

	@Transactional(readOnly = false)
	@Override
	public void salvar(Cliente cliente) {
		dao.save(cliente);
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Cliente cliente) {
		dao.update(cliente);
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	public Cliente buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Cliente> buscarTodos() {
		
		return dao.findAll();
	}

	@Override
	public List<Cliente> buscarPorNome(String nome) {
		
		return dao.findByNome(nome);
	}

}
