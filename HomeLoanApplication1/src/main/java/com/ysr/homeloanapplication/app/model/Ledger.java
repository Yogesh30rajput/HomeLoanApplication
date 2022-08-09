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
public class Ledger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emiID;
	private String month;
	private double emi;
	private double monthlyInterest;
	private double principlePaid;
	private double remainingBalance;
	private double defaulterCount;
	private String status;

}
