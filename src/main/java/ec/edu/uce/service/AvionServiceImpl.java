package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Avion;
import ec.edu.uce.repository.IAvionRepo;

@Service
public class AvionServiceImpl implements IAvionService {

	@Autowired
	private IAvionRepo avionRepo;
	
	@Override
	public void insertarAvion(Avion avion) {
		// TODO Auto-generated method stub

		this.avionRepo.insertarAvion(avion);
	}

	@Override
	public void actualizarAvion(Avion avion) {
		// TODO Auto-generated method stub

		this.avionRepo.actualizarAvion(avion);
	}

	@Override
	public Avion buscarAvionPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.avionRepo.buscarAvionPorId(id);
	}

	@Override
	public void eliminarAvionPorId(Integer id) {
		// TODO Auto-generated method stub

		this.avionRepo.eliminarAvionPorId(id);
	}

}
