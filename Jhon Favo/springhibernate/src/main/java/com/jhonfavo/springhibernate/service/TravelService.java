package com.jhonfavo.springhibernate.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;


import com.jhonfavo.springhibernate.model.TravelModel;

@Service
public class TravelService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<TravelModel> selectAll(){
		return entityManager.createQuery("select t from TravelModel t", TravelModel.class).getResultList();
		
	}
	
	public void insert (TravelModel trv) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.persist(trv);
		em.getTransaction().commit();
		
	}
	
	public void update (TravelModel trv) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.merge(trv);
		em.getTransaction().commit();
	}
	
	public void delete (TravelModel trv) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.createNativeQuery("delete from TravelModel where id =?1", TravelModel.class)
		.setParameter(1, trv.getIdTravel()).executeUpdate();
		em.getTransaction().commit();
		
		
	}

}
