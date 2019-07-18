package com.springdb.muhamadderryprasetyanugraha.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;


import com.springdb.muhamadderryprasetyanugraha.model.Penumpang;

@Service
public class PenumpangService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Penumpang> selectAll() {
		return entityManager.createQuery("select m from Penumpang m", Penumpang.class)
				.getResultList();
	}
	
	
	public Penumpang findPenumpangById(long id_penumpang) {
		return entityManager.find(Penumpang.class, id_penumpang);
	}
	
	
	public void insert(Penumpang numpang)  {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.persist(numpang);
		em.getTransaction().commit();
	}
	
	public void update(Penumpang numpang) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.merge(numpang);
		em.getTransaction().commit();
	}
	
	public void delete(Penumpang numpang) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.createNativeQuery("delete from penumpang where id = ?1", Penumpang.class)
		.setParameter(1, numpang.getIdPenumpang())
		.executeUpdate();
		em.getTransaction().commit();
	}
}
