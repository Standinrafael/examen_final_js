package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Cliente;


@Repository
@Transactional
public class ClienteRepoImpl implements IClienteRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarCliente(Cliente cliente) {
		// TODO Auto-generated method stub

		this.entityManager.persist(cliente);
	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub

		this.entityManager.merge(cliente);
	}

	@Override
	public Cliente buscarClientePorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cliente.class, id);
	}

	@Override
	public void eliminarClientePorId(Integer id) {
		// TODO Auto-generated method stub

		Cliente clienteEliminar=this.buscarClientePorId(id);
		this.entityManager.remove(clienteEliminar);
	}

}
