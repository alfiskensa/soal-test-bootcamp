package com.jhonfavo.springhibernate.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import com.jhonfavo.springhibernate.model.TiketModel;

@Service
public class TiketService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<TiketModel> selectAll(){
		return entityManager.createQuery("select t from TiketModel t", TiketModel.class).getResultList();
		
	}
	
	public void insert (TiketModel tkt) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.persist(tkt);
		em.getTransaction().commit();
		
	}
	
	public void update (TiketModel tkt) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.merge(tkt);
		em.getTransaction().commit();
	}
	
	public void delete (TiketModel tkt) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.createNativeQuery("delete from TiketModel where id =?1", TiketModel.class)
		.setParameter(1, tkt.getIdTiket()).executeUpdate();
		em.getTransaction().commit();
		
		
	}

}
