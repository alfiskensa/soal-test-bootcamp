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
import com.springdb.muhamadderryprasetyanugraha.model.Travel;
import com.springdb.muhamadderryprasetyanugraha.repository.TravelRepository;

@RestController
public class TravelController {

	@Autowired
	TravelRepository travelRepository;
	
	@GetMapping(value ="/tvl")
	public List<Travel> getAllTravel(){
		return travelRepository.findAll();
	}
	
	@GetMapping(value ="tvl/{id}")
	public Travel getTravelById(@PathVariable("id") Long idTravel) {
		return travelRepository.findById(idTravel).orElse(null);
	}
	
	@PostMapping(value="/tvl")
	public Travel create(@RequestBody Travel travel) {
		return travelRepository.save(travel);
	}
	
	@PutMapping("tvl/{id}")
	public Travel update(@PathVariable("id") Long idTravel,
			@RequestBody Travel travel) {
		return travelRepository.save(travel);
	}
	
	
	
	@DeleteMapping("/tvl/{id}")
	public Map<String, Boolean> delete(@PathVariable("id") Long idTravel){
		Travel tvl = travelRepository.getOne(idTravel);
		travelRepository.delete(tvl);
		
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("status", true);
		return map;
	}
}
