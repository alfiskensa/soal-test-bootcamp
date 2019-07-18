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

import com.jhonfavo.springhibernate.model.TiketModel;
import com.jhonfavo.springhibernate.repository.TiketRepository;


@RestController
public class TiketController {
	
	@Autowired
	TiketRepository tiketRepository;
	
	@GetMapping("/tiket")
	public List<TiketModel> getAllTiketModel(){
		return tiketRepository.findAll();
	}
	
	@PostMapping("/tiket")
	public TiketModel create(@RequestBody TiketModel tiketModel) {
		return tiketRepository.save(tiketModel);
	}
	
	@PutMapping("/tiket/{id}")
	public TiketModel update (@PathVariable("idTiket") Long id, @RequestBody TiketModel tiketModel) {
		return tiketRepository.save(tiketModel);
	
	}
	
	@DeleteMapping("/tiket{id}")
	public Map<String, String> delete (@PathVariable("id") Long id){
		TiketModel tkt =tiketRepository.getOne(id);
		tiketRepository.delete(tkt);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("status", "berhasil");
		return map;
	}

}
