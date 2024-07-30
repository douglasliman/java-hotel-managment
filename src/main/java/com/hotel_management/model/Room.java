package com.hotel_management.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_rooms")
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "number")
	@NotNull(message = "Number is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	int number;

	
	@Column(name = "floor")
	@NotNull(message = "Number is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	int floor;

	@ManyToMany
	@JoinTable(
			name = "room_services",
			joinColumns = @JoinColumn(name = "room_id"),
			inverseJoinColumns = @JoinColumn(name = "service_id")
	)
	private Set<Services> services;

	@OneToOne
	@JoinColumn(name = "guest_id")
	Guest guest;



	@Column(name = "roomType")
	@NotNull(message = "Number is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	String roomType;
	
	@Column(name = "bedType")
	@NotNull(message = "Number is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	String bedType;
	
	@Column(name = "bedAuxiliar")
	@NotNull(message = "Number is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	int extraBed;
	
	@Column(name = "observations")
	@NotNull(message = "Number is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	String notes;
	
	@Column(name = "guests")
	@NotNull(message = "Number is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	int guestQuantity;
	
	@Column(name = "dailyRate")
	@NotNull(message = "Number is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	Double dailyRate;
	
	@Column(name = "available")
	@NotNull(message = "Number is necessary")
	@Size(message = "only true or false characters")
	Boolean available;
	
}
