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

import com.jhonfavo.springhibernate.model.TravelModel;
import com.jhonfavo.springhibernate.repository.TravelRepository;



@RestController
public class TravelController {
	
	@Autowired
	TravelRepository travelRepository;
	
	@GetMapping("/travel")
	public List<TravelModel> getAllTravelModel(){
		return travelRepository.findAll();
	}
	
	@PostMapping("/travel")
	public TravelModel create(@RequestBody TravelModel travelModel) {
		return travelRepository.save(travelModel);
	}
	
	@PutMapping("/travel/{id}")
	public TravelModel update (@PathVariable("idTravel") Long id, @RequestBody TravelModel travelModel) {
		return travelRepository.save(travelModel);
	
	}
	
	@DeleteMapping("/travel{id}")
	public Map<String, String> delete (@PathVariable("id") Long id){
		TravelModel trv =travelRepository.getOne(id);
		travelRepository.delete(trv);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("status", "berhasil");
		return map;
	}

}
