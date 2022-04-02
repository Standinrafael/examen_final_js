package ec.edu.uce.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import ec.edu.uce.modelo.Vuelo;

@Repository
@Transactional
public class VueloRepoImpl implements IVueloRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarVuelo(Vuelo vuelo) {
		// TODO Auto-generated method stub

		this.entityManager.persist(vuelo);
	}

	@Override
	public void actualizarVuelo(Vuelo vuelo) {
		// TODO Auto-generated method stub

		this.entityManager.merge(vuelo);
	}

	@Override
	public Vuelo buscarVueloPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Vuelo.class, id);
	}

	@Override
	public void eliminarVueloPorId(Integer id) {
		// TODO Auto-generated method stub

		Vuelo vueloEliminar=this.buscarVueloPorId(id);
		this.entityManager.remove(vueloEliminar);
	}

	@Override
	public Vuelo buscarVueloPorNumero(String numero) {
		// TODO Auto-generated method stub
		try {
			TypedQuery<Vuelo> miQuery = this.entityManager.createQuery("select v from Vuelo v where v.numero=:numero",
					Vuelo.class);
			miQuery.setParameter("numero", numero);
			return miQuery.getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}

	@Override
	public List<Vuelo> buscarVuelos(String destino, String origen, LocalDateTime fechaDeVuelo) {
		// TODO Auto-generated method stub
		TypedQuery<Vuelo> miQuery = this.entityManager.createQuery("select v from Vuelo v where v.destino=:destino and v.origen=:origen and v.fechaVuelo=:fechaVuelo",
				Vuelo.class);
		miQuery.setParameter("destino",destino);
		miQuery.setParameter("origen", origen);
		miQuery.setParameter("fechaVuelo", fechaDeVuelo);
		return miQuery.getResultList();
	}

}
