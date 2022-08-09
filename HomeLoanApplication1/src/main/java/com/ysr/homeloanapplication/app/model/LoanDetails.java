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

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanId;
	private int loanNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Ledger ledger;
	private double loanAmount;
	private int rateOfInterest;
	private int tenure;
	private double totalAmountToBePaid;
	private int processingFees;
	private double totalInterest;
	private String sanctionDate;
	private String remark;
	private String status;

}
