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
public class AllCustomerDocs {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int documentID;
	
	private byte[] addressProof;
	private byte[] panCard;
	private byte[] itr_incomeTaxReturn;
	private byte[] aadharCard;
	private byte[] photo;
	private byte[] signature;
	private byte[] thumb;
	private byte[] bankCheque;
	private byte[] salarySlip;

}
