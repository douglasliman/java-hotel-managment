package com.hotel_management.model;

import jakarta.persistence.*;
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
@Table(name= "tb_guest")
public class Guest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	@NotNull(message = "Name is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	private String name;

	@Column(name = "document")
	@NotNull(message = "Document is necessary")
	@Size(min = 2, message = "min size is 2 characters")
	private String document;

	@OneToOne(mappedBy = "guest")
	private Room room;

	@OneToOne
	@JoinColumn(name = "address_id")
	private Address address;
}
