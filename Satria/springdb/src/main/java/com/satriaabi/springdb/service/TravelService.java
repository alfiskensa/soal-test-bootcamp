package com.satriaabi.springdb.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.satriaabi.springdb.model.Travel;

@Service
public class TravelService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Travel> selectAll(){
		return entityManager.createQuery("select r from Travel r", Travel.class).getResultList();
	}

	public Travel findTravelById(long id_travel) {
		
		return entityManager.find(Travel.class, id_travel);
	}
	
	public void insert(Travel tra) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.persist(tra);
		em.getTransaction().commit();
		}
	
	public void update(Travel tra) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.merge(tra);
		em.getTransaction().commit();
	}
	
	public void delete(Travel tra) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.createNativeQuery("delete from Travel where id_travel = ?1", Travel.class).setParameter(1, tra.getIdTravel()).executeUpdate();
		em.getTransaction().commit();
	}

}
