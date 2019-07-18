package com.jhonfavo.springhibernate.controller;



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

import com.jhonfavo.springhibernate.model.PenumpangModel;
import com.jhonfavo.springhibernate.repository.PenumpangRepository;


@RestController
public class PenumpangController {
	
	@Autowired
	PenumpangRepository penumpangRepository;
	
	@GetMapping("/penumpang")
	public List<PenumpangModel> getAllPenumpangModel(){
		return penumpangRepository.findAll();
	}
	
	@PostMapping("/penumpang")
	public PenumpangModel create(@RequestBody PenumpangModel penumpangModel) {
		return penumpangRepository.save(penumpangModel);
	}
	
	@PutMapping("/penumpang/{id}")
	public PenumpangModel update (@PathVariable("idPenumpang") Long id, @RequestBody PenumpangModel penumpangModel) {
		return penumpangRepository.save(penumpangModel);
	
	}
	
	@DeleteMapping("/penumpang{id}")
	public Map<String, String> delete (@PathVariable("id") Long id){
		PenumpangModel pnp =penumpangRepository.getOne(id);
		penumpangRepository.delete(pnp);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("status", "berhasil");
		return map;
	}
}
