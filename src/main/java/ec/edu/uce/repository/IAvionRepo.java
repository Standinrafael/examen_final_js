package ec.edu.uce.repository;

import ec.edu.uce.modelo.Avion;

public interface IAvionRepo {

	void insertarAvion(Avion avion);
	void actualizarAvion(Avion avion);
	Avion buscarAvionPorId(Integer id);
	void eliminarAvionPorId(Integer id);
}
