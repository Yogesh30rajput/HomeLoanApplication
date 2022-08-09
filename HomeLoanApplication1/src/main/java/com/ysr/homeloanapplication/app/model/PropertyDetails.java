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
public class PropertyDetails {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int propertyID;
//	private String propertyType;
//	private String propertyArea;
//	private double propertyPrice;
//	private double constructionPrice;
//	private byte[] propertyDocuments;
//	private byte[] priceProofs;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer propertyId;
	private String propertyAddress;
	private String propertyName;
	private String propertyStatus;
	private String propertyAgreementAmount;
	@OneToOne(cascade = CascadeType.ALL)
	private BuilderDetails builderDetails;
}
