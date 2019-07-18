package com.springdb.muhamadderryprasetyanugraha.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import com.springdb.muhamadderryprasetyanugraha.model.Travel;

@Service
public class TravelService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Travel> selectAll() {
		return entityManager.createQuery("select m from Travel m", Travel.class)
				.getResultList();
	}
	
	
	public Travel findTravelById(long id_travel) {
		return entityManager.find(Travel.class, id_travel);
	}
	
	
	
	public void insert(Travel tvl)  {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.persist(tvl);
		em.getTransaction().commit();
	}
	
	public void update(Travel tvl) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.merge(tvl);
		em.getTransaction().commit();
	}
	
	public void delete(Travel tvl) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.createNativeQuery("delete from travel where id = ?1", Travel.class)
		.setParameter(1, tvl.getIdTravel())
		.executeUpdate();
		em.getTransaction().commit();
	}
}
