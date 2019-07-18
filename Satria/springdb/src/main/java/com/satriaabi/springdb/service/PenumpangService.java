package com.satriaabi.springdb.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.satriaabi.springdb.model.Penumpang;

@Service
public class PenumpangService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Penumpang> selectAll(){
		return entityManager.createQuery("select p from Penumpang p", Penumpang.class).getResultList();
	}

	public Penumpang findPenumpangById(long id_penumpang) {
		
		return entityManager.find(Penumpang.class, id_penumpang);
	}
	
	public void insert(Penumpang pen) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.persist(pen);
		em.getTransaction().commit();
		}
	
	public void update(Penumpang pen) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.merge(pen);
		em.getTransaction().commit();
	}
	
	public void delete(Penumpang pen) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.createNativeQuery("delete from Penumpang where id_penumpang = ?1", Penumpang.class).setParameter(1, pen.getIdPenumpang()).executeUpdate();
		em.getTransaction().commit();
	}
}
