package com.ysr.homeloanapplication.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class EnquiryDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int enquiryId;
	
	
	private String customerName;
	
	private double customerMobileNumber;
	
	private String customerEmailId;
	
	private String customerGender;
	
	private String customerAge;
	
	private String panCardNumber;
	
	private String enquiryStatus;
	
 
	private double loanAmount;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Cibil Cibil;

}
