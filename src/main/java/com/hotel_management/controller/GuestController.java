package com.hotel_management.controller;

import com.hotel_management.model.Guest;
import com.hotel_management.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestRepository guestRepository;

    @GetMapping
    public ResponseEntity<List<Guest>> getAllGuests() {
        return ResponseEntity.ok(guestRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Guest> createGuest(@RequestBody Guest guest) {
        Guest savedGuest = guestRepository.save(guest);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedGuest);
    }


}
