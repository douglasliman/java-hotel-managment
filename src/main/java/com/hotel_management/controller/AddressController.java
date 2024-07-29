package com.hotel_management.controller;

import com.hotel_management.model.Address;
import com.hotel_management.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    //working
    @GetMapping
    public ResponseEntity<List<Address>>getAllAddress(){
        return ResponseEntity.ok(addressRepository.findAll());
    }

    //working
    @PostMapping
    public ResponseEntity<Address>createAddress(@RequestBody Address address){
        Address savedAddress = addressRepository.save(address);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAddress);
    }
}








