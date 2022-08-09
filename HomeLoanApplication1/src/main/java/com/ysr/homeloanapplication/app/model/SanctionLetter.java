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
public class SanctionLetter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sanctionId;
	private String sanctionDate;
	private int prospectNumber;
	private String applicantName;
	private double contactDetails;
	private double loanAmountSanctioned;
	private String interestType;
	private int rateOfInterest;
	private int loanTenure;
	private double monthlyEmiAmount;
	private String modeOfPayment;
	private String remarks;
	private String termsAndCondition;
	private String status;

}
