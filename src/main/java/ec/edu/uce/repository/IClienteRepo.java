package ec.edu.uce.repository;

import ec.edu.uce.modelo.Cliente;

public interface IClienteRepo {

	void insertarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	Cliente buscarClientePorId(Integer id);
	void eliminarClientePorId(Integer id);
}
