package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.Vuelo;

public interface IGestorClienteService {

	List<Vuelo> buscarVuelosDisponibles(String Origen, String Destino, LocalDateTime fechaVuelo);
	
	Vuelo reservarPasajes(String numeroVuelo);
}
