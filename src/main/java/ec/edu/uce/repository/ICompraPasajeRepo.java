package ec.edu.uce.repository;

import ec.edu.uce.modelo.CompraPasaje;

public interface ICompraPasajeRepo {

	void insertarPasaje(CompraPasaje pasaje);
	void actualizarPasaje(CompraPasaje pasaje);
	CompraPasaje buscarPasajePorId(Integer id);
	void eliminarPasajePorId(Integer id);
	
	CompraPasaje buscarPasajePorNumero(String numero);
}
