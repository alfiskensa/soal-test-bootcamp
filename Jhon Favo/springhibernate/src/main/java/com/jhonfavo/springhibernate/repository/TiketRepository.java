package com.jhonfavo.springhibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonfavo.springhibernate.model.TiketModel;

public interface TiketRepository extends JpaRepository<TiketModel, Long>{

}
