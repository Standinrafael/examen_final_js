package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vuelo;
import ec.edu.uce.modelo.VueloSencillo;
import ec.edu.uce.repository.IVueloRepo;

@Service
public class VueloServiceImpl implements IVueloService {

	
	@Autowired
	private IVueloRepo vueloRepo;
	
	@Override
	public void insertarVuelo(Vuelo vuelo) {
		// TODO Auto-generated method stub

		this.vueloRepo.insertarVuelo(vuelo);
	}

	@Override
	public void actualizarVuelo(Vuelo vuelo) {
		// TODO Auto-generated method stub

		this.vueloRepo.actualizarVuelo(vuelo);
	}

	@Override
	public Vuelo buscarVueloPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.vueloRepo.buscarVueloPorId(id);
	}

	@Override
	public void eliminarVueloPorId(Integer id) {
		// TODO Auto-generated method stub

		this.vueloRepo.eliminarVueloPorId(id);
	}

	@Override
	public Vuelo buscarVueloPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.vueloRepo.buscarVueloPorNumero(numero);
	}

	@Override
	public List<Vuelo> buscarVuelos(String destino, String origen, LocalDateTime fechaDeVuelo) {
		// TODO Auto-generated method stub
		return this.vueloRepo.buscarVuelos(destino, origen, fechaDeVuelo);
	}

	

}
