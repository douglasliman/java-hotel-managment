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
@Table(name= "tb_address")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "position")
	@NotNull(message = "position is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	String position;
	
	@Column(name = "department")
	@NotNull(message = "department is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	String department;
	
	@Column(name = "shift")
	@NotNull(message = "shift is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	String shift;

	
	Address address;
	
	@Column(name = "salary")
	@NotNull(message = "salary is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	double salary;
	
	@Column(name = "country")
	@NotNull(message = "Country is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	LocalDate hireDate;
	
	@Column(name = "termination_date")
	@NotNull(message = "Termination Date is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	LocalDate terminationDate;
	
	@Column(name = "isWorking")
	@NotNull(message = "is_working is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	boolean isWorking;
}
