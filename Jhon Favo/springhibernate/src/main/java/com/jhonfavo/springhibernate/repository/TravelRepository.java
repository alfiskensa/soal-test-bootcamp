package com.jhonfavo.springhibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonfavo.springhibernate.model.TravelModel;

public interface TravelRepository extends JpaRepository<TravelModel, Long>{

}
