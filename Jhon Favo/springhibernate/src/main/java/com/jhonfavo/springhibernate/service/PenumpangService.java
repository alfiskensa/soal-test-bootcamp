package com.jhonfavo.springhibernate.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.jhonfavo.springhibernate.model.PenumpangModel;

@Service
public class PenumpangService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<PenumpangModel> selectAll(){
		return entityManager.createQuery("select p from PenumpangModel p", PenumpangModel.class).getResultList();
		
	}
	
	public void insert (PenumpangModel pnp) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.persist(pnp);
		em.getTransaction().commit();
		
	}
	
	public void update (PenumpangModel pnp) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.merge(pnp);
		em.getTransaction().commit();
	}
	
	public void delete (PenumpangModel pnp) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.createNativeQuery("delete from PenumpangModel where id =?1", PenumpangModel.class)
		.setParameter(1, pnp.getIdPenumpang()).executeUpdate();
		em.getTransaction().commit();
		
		
	}

}
