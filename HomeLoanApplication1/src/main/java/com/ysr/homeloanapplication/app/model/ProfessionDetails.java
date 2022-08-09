package com.ysr.homeloanapplication.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProfessionDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerProfessionId;
	
	private String professionType;

	private String professionDesignation;
	
	private double monthlyIncome;
	
	@Lob
	private byte[] professionSalarySlip;

}
