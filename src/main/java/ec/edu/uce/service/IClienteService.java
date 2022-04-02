package ec.edu.uce.service;

import ec.edu.uce.modelo.Cliente;

public interface IClienteService {
	void insertarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	Cliente buscarClientePorId(Integer id);
	void eliminarClientePorId(Integer id);
}
