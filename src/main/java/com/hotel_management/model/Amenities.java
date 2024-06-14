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
@Table(name = "tb_amenities")
public class Amenities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "amenity_image")
	@NotNull(message = "Amenity Image is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	String amenityImage; 
	
	@Column(name = "amenity_name")
	@NotNull(message = "Amenity Name is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	String amenityName; 
	
	
	Address address;

}
