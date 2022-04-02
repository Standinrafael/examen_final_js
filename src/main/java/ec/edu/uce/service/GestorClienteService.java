package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vuelo;
import ec.edu.uce.modelo.VueloSencillo;

@Service
public class GestorClienteService implements IGestorClienteService {

	final static Logger LOGGER = Logger.getLogger(GestorClienteService.class);
	
	@Autowired
	private IVueloService vueloService;
	
	@Override
	public List<Vuelo> buscarVuelosDisponibles(String Origen, String Destino, LocalDateTime fechaVuelo) {
		// TODO Auto-generated method stub
		List<Vuelo> lista=this.vueloService.buscarVuelos(Destino, Origen, fechaVuelo);
		
				
		List<Vuelo>lista2=lista.parallelStream().filter( vuelo-> vuelo.getEstado()== "Disponible").collect(Collectors.toList());
	
		
		
		
		return lista2;
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
