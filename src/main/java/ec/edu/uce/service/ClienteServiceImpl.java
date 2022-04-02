package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.repository.IClienteRepo;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepo clienteRepo;
	
	@Override
	public void insertarCliente(Cliente cliente) {
		// TODO Auto-generated method stub

		this.clienteRepo.insertarCliente(cliente);
	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub

		this.clienteRepo.actualizarCliente(cliente);
	}

	@Override
	public Cliente buscarClientePorId(Integer id) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscarClientePorId(id);
	}

	@Override
	public void eliminarClientePorId(Integer id) {
		// TODO Auto-generated method stub

		this.clienteRepo.eliminarClientePorId(id);
	}

}
