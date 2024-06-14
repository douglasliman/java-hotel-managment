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
	
	@Column(name = "service_description")
	@NotNull(message = "Service Description is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	String serviceDescription;
}
