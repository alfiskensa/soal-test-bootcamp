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

import com.satriaabi.springdb.model.Travel;
import com.satriaabi.springdb.repository.TravelRepository;


@RestController
public class TravelController {

	@Autowired
	TravelRepository travelRepository;
	
	@GetMapping("/tra")
	public List<Travel> getAllTravel(){
		return travelRepository.findAll();
	}
	
	@GetMapping("/tra/{id}")
	public Travel getTravelById(@PathVariable("id") Long idTravel) {
		return travelRepository.findById(idTravel).orElse(null);
	}
	
	@PostMapping("/tra")
	public Travel create(@Valid @RequestBody Travel travel) {
		return travelRepository.save(travel);
	}
	
	@PutMapping("/tra/{id}")
	public Travel update(@PathVariable("id") Long idTravel, @RequestBody Travel travel) {
		return travelRepository.save(travel);
	}
	
	@DeleteMapping("/tra/{id}")
	public Map<String, String> delete(@PathVariable("id") Long idTravel) {
		Travel tra = travelRepository.getOne(idTravel);
		travelRepository.delete(tra);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("Status", "Berhasil");
		return map;
	}
}
