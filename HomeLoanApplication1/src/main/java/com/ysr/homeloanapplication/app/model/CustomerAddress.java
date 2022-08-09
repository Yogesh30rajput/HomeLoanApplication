package com.ysr.homeloanapplication.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String customerAreaName;
	private String customerCityName;
	private String customerDistrict;
	private String customerState;
	private double customerPincode;

}
