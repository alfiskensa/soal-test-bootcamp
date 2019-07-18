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
import com.springdb.muhamadderryprasetyanugraha.model.Tiket;
import com.springdb.muhamadderryprasetyanugraha.repository.TiketRepository;

@RestController
public class TiketController {
	
	@Autowired
	TiketRepository tiketRepository;
	
	@GetMapping(value ="/tkt")
	public List<Tiket> getAllTiket(){
		return tiketRepository.findAll();
	}
	
	@GetMapping(value ="tkt/{id}")
	public Tiket getTiketById(@PathVariable("id") Long idTiket) {
		return tiketRepository.findById(idTiket).orElse(null);
	}
	
	@PostMapping(value="/tkt")
	public Tiket create(@RequestBody Tiket tiket) {
		return tiketRepository.save(tiket);
	}
	
	@PutMapping("tkt/{id}")
	public Tiket update(@PathVariable("id") Long idTiket,
			@RequestBody Tiket tiket) {
		return tiketRepository.save(tiket);
	}
	
	
	@DeleteMapping("/tkt/{id}")
	public Map<String, Boolean> delete(@PathVariable("id") Long idTiket){
		Tiket tkt = tiketRepository.getOne(idTiket);
		tiketRepository.delete(tkt);
		
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("status", true);
		return map;
	}

}
