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
public class BuilderDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer builderDetailsId;
	private String builderName;
	private String builderBankName;
	private Long builderAccountNumber;
	private Integer bankIfscNumber;

}
