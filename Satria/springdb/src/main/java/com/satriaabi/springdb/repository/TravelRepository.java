package com.satriaabi.springdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satriaabi.springdb.model.Travel;


@Repository
public interface TravelRepository extends JpaRepository<Travel, Long>{

}
