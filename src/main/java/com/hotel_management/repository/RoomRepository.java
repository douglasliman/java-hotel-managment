package com.hotel_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel_management.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
