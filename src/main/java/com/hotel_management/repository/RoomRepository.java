package com.hotel_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel_management.model.Room;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
