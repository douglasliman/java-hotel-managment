package com.hotel_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel_management.model.Accommodation;
import com.hotel_management.repository.AccommodationRepository;

@RestController
@RequestMapping("/accommodation")
public class AccommodationController {

	@Autowired
	private AccommodationRepository accommodationRepository;

	@GetMapping
	public ResponseEntity<List<Accommodation>> dafne() {
		return ResponseEntity.ok(accommodationRepository.findAll());
	}
	
	

	/*
	@PostMapping
	public ResponseEntity<Postagem> post(@Valid @RequestBody Postagem postagem){
		if (temaRepository.existsById(postagem.getTema().getId()))
			return ResponseEntity.status(HttpStatus.CREATED)
					.body(postagemRepository.save(postagem));
			
		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Tema não existe!", null);
	} */
	
	
}