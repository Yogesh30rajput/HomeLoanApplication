package com.ysr.homeloanapplication.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerMortgageDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mortgageID;
	private double mortgagePropertyValue;
	private byte[] mortgagePropertyProof;
	private String mortgagePropertyType;
	private double mortgageLoanOnProperty;

}
