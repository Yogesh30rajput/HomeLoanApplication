package com.ysr.homeloanapplication.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class PreviousLoanDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer previousLoanDetailsId;
	private Long loanAmount;
	private Integer loanTenure;
	private Long paidAmount;
	private Long remainingAmount;
	private Integer defaulterCount;
	private String bankName;

}
