package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.Vuelo;

public interface IVueloService {
	void insertarVuelo(Vuelo vuelo);
	void actualizarVuelo(Vuelo vuelo);
	Vuelo buscarVueloPorId(Integer id);
	void eliminarVueloPorId(Integer id);
	
	Vuelo buscarVueloPorNumero(String numero);
	
	List<Vuelo> buscarVuelos(String destino, String origen, LocalDateTime fechaDeVuelo);
}
