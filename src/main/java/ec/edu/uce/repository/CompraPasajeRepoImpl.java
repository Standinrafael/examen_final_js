package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.CompraPasaje;


@Repository
@Transactional
public class CompraPasajeRepoImpl implements ICompraPasajeRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarPasaje(CompraPasaje pasaje) {
		// TODO Auto-generated method stub

		this.entityManager.persist(pasaje);
	}

	@Override
	public void actualizarPasaje(CompraPasaje pasaje) {
		// TODO Auto-generated method stub

		this.entityManager.merge(pasaje);
	}

	@Override
	public CompraPasaje buscarPasajePorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CompraPasaje.class, id);
	}

	@Override
	public void eliminarPasajePorId(Integer id) {
		// TODO Auto-generated method stub

		CompraPasaje pasajeEliminar=this.buscarPasajePorId(id);
		this.entityManager.remove(pasajeEliminar);
	}

	@Override
	public CompraPasaje buscarPasajePorNumero(String numero) {
		// TODO Auto-generated method stub
		try {
			TypedQuery<CompraPasaje> miQuery = this.entityManager.createQuery("select c from CompraPasaje c where c.numero=:numero",
					CompraPasaje.class);
			miQuery.setParameter("numero", numero);
			return miQuery.getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}

}
