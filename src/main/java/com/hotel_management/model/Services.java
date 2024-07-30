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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "tb_services")
public class Services {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "service_name")
	@NotNull(message = "Service Name is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	String serviceName;
	
	@Column(name = "service_value")
	@NotNull(message = "Service Value is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	double serviceValue;

	@ManyToMany(mappedBy = "services")
	private Set<Room> rooms;
	
	@Column(name = "service_description")
	@NotNull(message = "Service Description is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	String serviceDescription;
}
