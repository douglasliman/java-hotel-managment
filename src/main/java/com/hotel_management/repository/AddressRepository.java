package com.hotel_management.repository;

import com.hotel_management.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
    

}
