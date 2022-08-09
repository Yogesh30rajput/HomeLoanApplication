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
public class BankDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String branchName;
	private int branchID;
	private String ifscCode;
	private String micrCode;

	
	@OneToOne(cascade = CascadeType.ALL)
	private BankAddress branchAddress;
	private String email;
	private String status;

}
