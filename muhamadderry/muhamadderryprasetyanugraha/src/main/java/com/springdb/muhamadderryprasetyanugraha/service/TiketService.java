package com.springdb.muhamadderryprasetyanugraha.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.springdb.muhamadderryprasetyanugraha.model.Tiket;

@Service
public class TiketService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Tiket> selectAll() {
		return entityManager.createQuery("select m from Tiket m", Tiket.class)
				.getResultList();
	}
	
	
	public Tiket findTiketById(long id) {
		return entityManager.find(Tiket.class, id);
	}
	
	
	public void insert(Tiket tkt)  {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.persist(tkt);
		em.getTransaction().commit();
	}
	
	public void update(Tiket tkt) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.merge(tkt);
		em.getTransaction().commit();
	}
	
	public void delete(Tiket tkt) {
		EntityManager em = entityManager;
		em.getTransaction().begin();
		em.createNativeQuery("delete from tiket where id = ?1", Tiket.class)
		.setParameter(1, tkt.getIdTiket())
		.executeUpdate();
		em.getTransaction().commit();
	}
}
