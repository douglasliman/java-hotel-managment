package com.hotel_management.service;

import com.hotel_management.model.Guest;
import com.hotel_management.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class GuestService {

    @Autowired
private GuestRepository guestRepository;

    public Optional<Guest> updateGuest(Guest guest){
        if (guestRepository.findById(guest.getId()).isPresent()){
            System.out.println("Estou aqui");
        }
        return Optional.empty();
    }
    // lógica de atualização
}
