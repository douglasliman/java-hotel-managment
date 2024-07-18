package com.hotel_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel_management.model.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {

}
