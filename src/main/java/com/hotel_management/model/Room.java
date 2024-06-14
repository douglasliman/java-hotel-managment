package com.hotel_management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_quartos")
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
