package com.hotel_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel_management.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
