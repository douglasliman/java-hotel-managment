package com.hotel_management.model;

import java.time.LocalDate;

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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_accommodation")
public class Accommodation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	Guest guest;

	Room room;

	@Column(name = "check_in")
	@NotNull(message = "CheckIn is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	LocalDate checkIn;

	@Column(name = "check_out")
	@NotNull(message = "CheckOut is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	LocalDate checkOut;

	@Column(name = "total_value")
	@NotNull(message = "Total Value is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	double totalValue;
}
