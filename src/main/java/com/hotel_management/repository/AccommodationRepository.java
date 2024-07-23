package com.hotel_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel_management.model.Accommodation;
import org.springframework.stereotype.Repository;

@Repository
public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {

}
