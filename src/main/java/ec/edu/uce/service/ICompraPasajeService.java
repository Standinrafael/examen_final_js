package ec.edu.uce.service;

import ec.edu.uce.modelo.CompraPasaje;


public interface ICompraPasajeService {
	void insertarPasaje(CompraPasaje pasaje);
	void actualizarPasaje(CompraPasaje pasaje);
	CompraPasaje buscarPasajePorId(Integer id);
	void eliminarPasajePorId(Integer id);
	
	CompraPasaje buscarPasajePorNumero(String numero);
}
