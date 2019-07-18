package com.springdb.muhamadderryprasetyanugraha.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.springdb.muhamadderryprasetyanugraha.model.Penumpang;
import com.springdb.muhamadderryprasetyanugraha.repository.PenumpangRepository;

@RestController
public class PenumpangController {

	@Autowired
	PenumpangRepository penumpangRepository;

	@GetMapping(value ="/numpang")
	public List<Penumpang> getAllPenumpang(){
		return penumpangRepository.findAll();
	}
	
	@GetMapping(value ="numpang/{id}")
	public Penumpang getPenumpangById(@PathVariable("id") Long idPenumpang) {
		return penumpangRepository.findById(idPenumpang).orElse(null);
	}
	
	@PostMapping(value="/numpang")
	public Penumpang create(@RequestBody Penumpang penumpang) {
		return penumpangRepository.save(penumpang);
	}
	
	@PutMapping("numpang/{id}")
	public Penumpang update(@PathVariable("id") Long idPenumpang,
			@RequestBody Penumpang mahasiswa) {
		return penumpangRepository.save(mahasiswa);
	}
	
	
	
	@DeleteMapping("/numpang/{id}")
	public Map<String, Boolean> delete(@PathVariable("id") Long idPenumpang){
		Penumpang numpang = penumpangRepository.getOne(idPenumpang);
		penumpangRepository.delete(numpang);
		
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("status", true);
		return map;
	}
}
