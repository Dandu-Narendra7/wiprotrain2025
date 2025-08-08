package com.wipro.CarEx2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="vehicle_movement")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VelhicleMovement {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int vechId;
	double latitude;
	double longitude;
}
