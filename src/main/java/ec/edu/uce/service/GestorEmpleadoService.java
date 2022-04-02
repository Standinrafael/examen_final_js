package ec.edu.uce.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CompraPasaje;


@Service
public class GestorEmpleadoService implements IGestorEmpleadoService {

	final static Logger LOGGER = Logger.getLogger(GestorEmpleadoService.class);
	
	@Autowired
	private ICompraPasajeService pasajeService;
	
	@Override
	public CompraPasaje realizarCheckIn(String numero) {
		// TODO Auto-generated method stub
		
		try {
			
			CompraPasaje pasaje=this.pasajeService.buscarPasajePorNumero(numero);
			
			pasaje.setEstado("CHECK-IN");
			
			this.pasajeService.actualizarPasaje(pasaje);
			
			return pasaje;
			
		}catch(NullPointerException e) {
			LOGGER.info("No se encuentra el pasaje");
			return null;
		}
	}

}
