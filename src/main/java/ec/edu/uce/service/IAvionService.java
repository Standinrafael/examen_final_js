package ec.edu.uce.service;

import ec.edu.uce.modelo.Avion;

public interface IAvionService {
	void insertarAvion(Avion avion);
	void actualizarAvion(Avion avion);
	Avion buscarAvionPorId(Integer id);
	void eliminarAvionPorId(Integer id);
}
