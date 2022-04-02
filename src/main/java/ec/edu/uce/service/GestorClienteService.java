package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vuelo;

@Service
public class GestorClienteService implements IGestorClienteService {

	final static Logger LOGGER = Logger.getLogger(GestorClienteService.class);
	
	@Autowired
	private IVueloService vueloService;
	
	@Override
	public List<Vuelo> buscarVuelosDisponibles(String Origen, String Destino, LocalDateTime fechaVuelo) {
		// TODO Auto-generated method stub
		List<Vuelo> lista=this.vueloService.buscarVuelos(Destino, Origen, fechaVuelo);
		
		
		lista.parallelStream().filter( vuelo-> vuelo.getEstado()== "Disponible");
		
		
		return null;
	}

	@Override
	public Vuelo reservarPasajes(String numeroVuelo) {
		// TODO Auto-generated method stub

		try {
			Vuelo vuelo= this.vueloService.buscarVueloPorNumero(numeroVuelo);
			
			return vuelo;
		}catch(NullPointerException e) {
			LOGGER.info("No se encontro el vuelo");
			return null;
		}
		
	}

}
