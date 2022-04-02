package ec.edu.uce.controller;

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

@Controller
@RequestMapping("/vuelos/")
public class VueloController {

	@Autowired
	private IGestorClienteService clienteService;
	
	@Autowired
	private IGestorEmpleadoService empleadoService;
	
	
	
	//BuscarVuelosDisponibles
	@GetMapping("buscar/{idEstudiante}")
	public String obtenerUsuario(@PathVariable("idEstudiante") Integer idEstudiante, Model modelo) {

		List<Vuelo> vuelos=this.clienteService.buscarVuelosDisponibles(null, null, null);


		modelo.addAttribute("vuelos", vuelos);
		return "lista";
	}
	
	//Realizar Check In
	@GetMapping("citaActualiza/{numeroPasaje}")
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
