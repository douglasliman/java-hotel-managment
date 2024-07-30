package com.hotel_management.controller;

import com.hotel_management.model.Guest;
import com.hotel_management.repository.AddressRepository;
import com.hotel_management.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.hotel_management.service.GuestService;

import java.util.List;
@RestController
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestRepository guestRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private GuestService guestService;


    //working
    @GetMapping
    public ResponseEntity<List<Guest>> getAllGuests() {
        return ResponseEntity.ok(guestRepository.findAll());
    }



    @PostMapping
    public ResponseEntity<?> createGuest(@RequestBody Guest guest) {
        if (!addressRepository.existsById(guest.getAddress().getId())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Address not found.");
        }

        Guest savedGuest = guestRepository.save(guest);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedGuest);
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<Guest>> getByName(@PathVariable String name) {
        return ResponseEntity.ok(guestRepository.findAllByNameContainingIgnoreCase(name));
    }

    @PutMapping("/update")
    public ResponseEntity<Guest>updateGuest(@RequestBody Guest guest) {
        return guestService.updateGuest(guest)
                .map(res -> ResponseEntity.status(HttpStatus.OK).body(res))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
//deu certo

}
