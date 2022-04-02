package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CompraPasaje;
import ec.edu.uce.repository.ICompraPasajeRepo;

@Service
public class CompraPasajeServiceImpl implements ICompraPasajeService {

	@Autowired
	private ICompraPasajeRepo pasajeRepo;
	
	@Override
	public void insertarPasaje(CompraPasaje pasaje) {
		// TODO Auto-generated method stub

		this.pasajeRepo.insertarPasaje(pasaje);
	}

	@Override
	public void actualizarPasaje(CompraPasaje pasaje) {
		// TODO Auto-generated method stub

		this.pasajeRepo.actualizarPasaje(pasaje);
	}

	@Override
	public CompraPasaje buscarPasajePorId(Integer id) {
		// TODO Auto-generated method stub
		return this.pasajeRepo.buscarPasajePorId(id);
	}

	@Override
	public void eliminarPasajePorId(Integer id) {
		// TODO Auto-generated method stub

		this.pasajeRepo.eliminarPasajePorId(id);
	}

	@Override
	public CompraPasaje buscarPasajePorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.pasajeRepo.buscarPasajePorNumero(numero);
	}

}
