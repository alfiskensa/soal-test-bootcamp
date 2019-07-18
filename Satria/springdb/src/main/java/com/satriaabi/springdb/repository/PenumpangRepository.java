package com.satriaabi.springdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satriaabi.springdb.model.Penumpang;


@Repository
public interface PenumpangRepository extends JpaRepository<Penumpang, Long>{

}
