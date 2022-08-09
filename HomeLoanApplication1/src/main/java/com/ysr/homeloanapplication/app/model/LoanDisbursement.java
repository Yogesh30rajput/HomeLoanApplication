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
public class LoanDisbursement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int agreementId;
	private int loanNumber;
	private String agreementDate;
	private String amountPayType;
	private double totalAmount;
	private String bankName;
	private double accountNumber;
	private String ifscCode;
	private String accountType;
	private double transferAmount;
	private String paymentStatus;
	private String amountPaidDate;

}
