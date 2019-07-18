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

import com.satriaabi.springdb.model.Tiket;
import com.satriaabi.springdb.repository.TiketRepository;

@RestController
public class TiketController {

	@Autowired
	TiketRepository tiketRepository;
	
	@GetMapping("/tik")
	public List<Tiket> getAllTiket(){
		return tiketRepository.findAll();
	}
	
	@GetMapping("/tik/{id}")
	public Tiket getTiketById(@PathVariable("id") Long id) {
		return tiketRepository.findById(id).orElse(null);
	}
	
	@PostMapping("/tik")
	public Tiket create(@Valid @RequestBody Tiket tiket) {
		return tiketRepository.save(tiket);
	}
	
	@PutMapping("/tik/{id}")
	public Tiket update(@PathVariable("id") Long id, @RequestBody Tiket tiket) {
		return tiketRepository.save(tiket);
	}
	
	@DeleteMapping("/tik/{id}")
	public Map<String, String> delete(@PathVariable("id") Long id) {
		Tiket tik = tiketRepository.getOne(id);
		tiketRepository.delete(tik);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("Status", "Berhasil");
		return map;
	}
}
