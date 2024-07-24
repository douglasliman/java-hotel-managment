package com.hotel_management.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
@Table(name= "tb_address")
public class Address {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "state")
	@NotNull(message = "State is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	String state;
	
	@Column(name = "city")
	@NotNull(message = "City is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	String city;
	
	@Column(name = "neighborhood")
	@NotNull(message = "Neighborhood is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	String neighborhood;
	
	@Column(name = "street")
	@NotNull(message = "Street is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	String street;

	@NotNull(message = "Zip code is necessary")
	@Min(value = 1000000, message = "Zip code must be a valid 7-digit number")
	@Max(value = 99999999, message = "Zip code must be a valid 8-digit number")
	@JsonProperty("zip_code")
	private Integer zipCode;
	
	@Column(name = "Number")
	@NotNull(message = "Number is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	String number;
}
