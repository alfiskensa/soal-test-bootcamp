package com.satriaabi.springdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satriaabi.springdb.model.Tiket;


@Repository
public interface TiketRepository extends JpaRepository<Tiket, Long> {

}
