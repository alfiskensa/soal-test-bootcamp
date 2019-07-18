package com.satriaabi.springdb.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.satriaabi.springdb.model.Penumpang;
import com.satriaabi.springdb.repository.PenumpangRepository;

@RestController
public class PenumpangController {

	@Autowired
	PenumpangRepository penumpangRepository;
	
	@GetMapping("/pen")
	public List<Penumpang> getAllPenumpang(){
		return penumpangRepository.findAll();
	}
	
	@GetMapping("/pen/{id}")
	public Penumpang getPenumpangById(@PathVariable("id") Long idPenumpang) {
		return penumpangRepository.findById(idPenumpang).orElse(null);
	}
	
	@PostMapping("/pen")
	public Penumpang create(@Valid @RequestBody Penumpang penumpang) {
		return penumpangRepository.save(penumpang);
	}
	
	@PutMapping("/pen/{id}")
	public Penumpang update(@PathVariable("id") Long idPenumpang, @RequestBody Penumpang penumpang) {
		return penumpangRepository.save(penumpang);
	}
	
	@DeleteMapping("/pen/{id}")
	public Map<String, String> delete(@PathVariable("id") Long idPenumpang) {
		Penumpang pen = penumpangRepository.getOne(idPenumpang);
		penumpangRepository.delete(pen);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("Status", "Berhasil");
		return map;
	}
}
