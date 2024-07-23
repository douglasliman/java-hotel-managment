package com.hotel_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel_management.model.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {

}
