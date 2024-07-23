package com.hotel_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel_management.model.Services;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Long> {

}
