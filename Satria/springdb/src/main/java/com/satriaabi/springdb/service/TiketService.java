package com.satriaabi.springdb.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.satriaabi.springdb.model.Tiket;

@Service
public class TiketService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Tiket> selectAll(){
		return entityManager.createQuery("select t from Tiket t", Tiket.class).getResultList();
	}

	public Tiket findTiketById(long id) {
		
		return entityManager.find(Tiket.class, id);
	}
	
	public void insert(Tiket tik) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.persist(tik);
		em.getTransaction().commit();
		}
	
	public void update(Tiket tik) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.merge(tik);
		em.getTransaction().commit();
	}
	
	public void delete(Tiket tik) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.createNativeQuery("delete from Tiket where id = ?1", Tiket.class).setParameter(1, tik.getId()).executeUpdate();
		em.getTransaction().commit();
	}
}
