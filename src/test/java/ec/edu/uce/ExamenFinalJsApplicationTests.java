package ec.edu.uce;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.uce.modelo.Avion;
import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.modelo.Vuelo;
import ec.edu.uce.service.IAvionService;
import ec.edu.uce.service.IClienteService;
import ec.edu.uce.service.IVueloService;

@SpringBootTest
class ExamenFinalJsApplicationTests {

	@Autowired
	private IAvionService avionService;
	
	@Autowired
	private IVueloService vueloService;
	
	@Autowired
	private IClienteService clienteService;
	
	
	@Test
	void insertarAvion() {
		
		Avion avion= new Avion();
		avion.setCapacidadAsientos(100);
		avion.setNombre("LAN");
		
		
		List<Vuelo> lista= new ArrayList<>();
		
		Vuelo vuelo= new Vuelo();
		vuelo.setNumero("123");
		vuelo.setFechaVuelo(LocalDateTime.of(2022, Month.APRIL, 15, 10, 0));
		vuelo.setAsientosDisponibles(avion.getCapacidadAsientos());
		vuelo.setValorAsiento(new BigDecimal("95.00"));
		vuelo.setEstado("Disponible");
		vuelo.setOrigen("Guayaquil");
		vuelo.setDestino("Quito");
		vuelo.setCategoria("Negocios");
		vuelo.setAsientosOcupados(0);
		vuelo.setAvion(avion);
		
		lista.add(vuelo);
		
		avion.setVuelos(lista);
		
		this.avionService.insertarAvion(avion);
		assertNotNull(this.vueloService.buscarVueloPorId(2));
				
	}
	
	
	
	@Test
	void insertarCliente() {
		Cliente cliente= new Cliente();
		cliente.setApellido("Perez");
		cliente.setCedula("1105166290");
		cliente.setNombre("Felipe");
		
		this.clienteService.insertarCliente(cliente);
		assertNotNull(this.clienteService.buscarClientePorId(1));
	}


}
