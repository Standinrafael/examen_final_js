package ec.edu.uce.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import ec.edu.uce.modelo.CompraPasaje;
import ec.edu.uce.modelo.Vuelo;
import ec.edu.uce.service.IGestorClienteService;
import ec.edu.uce.service.IGestorEmpleadoService;
import ec.edu.uce.service.IVueloService;

@Controller
@RequestMapping("/vuelos/")
public class VueloController {

	@Autowired
	private IGestorClienteService clienteService;
	
	@Autowired
	private IGestorEmpleadoService empleadoService;
	
	@Autowired
	private IVueloService vueloService;
	
	
	
	//BuscarVuelosDisponibles
	@GetMapping("buscar/{origen}/{destino}/{fecha}")
	public String obtenerUsuario(@PathVariable("origen") String origen,String destino, LocalDateTime fecha, Model modelo) {

		List<Vuelo> vuelos=this.clienteService.buscarVuelosDisponibles(origen, destino, fecha);


		modelo.addAttribute("vuelos", vuelos);
		return "lista";
	}
	
	//Reservar Pasajes aereos
	
	@GetMapping("vueloActualiza/{numeroVuelo}")
	public String obtenerReserva(@PathVariable("numeroVuelo") String numeroVuelo, Vuelo vuelo,
			Model modelo) {
		Vuelo vuelo1=this.clienteService.reservarPasajes(numeroVuelo);
		modelo.addAttribute("vuelo", vuelo1);
		
		
		return "vueloActualiza";
	}
	
	@PutMapping("actualizarVuelo/{numeroVuelo}")
	public String actualizarCita(@PathVariable("numeroVuelo") String numeroVuelo, Vuelo vuelo) {

		vuelo.setNumero(numeroVuelo);
		
		if(vuelo.getEstado()=="Disponible") {
			
			
		}else {
			
			vuelo.setEstado("No Disponible");
			this.vueloService.actualizarVuelo(vuelo);
		}

		return "lista";
	}
	
	//Realizar Check In
	@GetMapping("pasajeActualiza/{numeroPasaje}")
	public String obtenerPaginaCheckIn(@PathVariable("numeroPasaje") String numerPasaje,CompraPasaje compraPasaje ,
			Model modelo) {
		
		CompraPasaje pasaje=this.empleadoService.realizarCheckIn(numerPasaje);
		modelo.addAttribute("pasaje", pasaje);
		return "pasejeCheck";
	}
	
	@PutMapping("actualizar/{numeroPasaje}")
	public String actualizarPasaje(@PathVariable("numeroPasaje") String numeroPasaje, CompraPasaje compraPasaje) {

		compraPasaje.setNumero(numeroPasaje);
		

		return "lista";
	}
}
