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
public class Customer<AccountDetails> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerID;
	
	private String customerName;
	private String customerDateOfBirth;
	private String customerGender;
	private String maritalStatus;
	private double loanAmount;
	private String emailId;
	private double mobileNumber;
	private String panCardNumber;
	private String aadharNumber;
	private String documentStatus;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress customerAddress;
	

	@OneToOne(cascade = CascadeType.ALL)
	private AllCustomerDocs customerAllPersonalDocs;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAccountDetails customerAccountDetails;
	

	@OneToOne(cascade = CascadeType.ALL)
	private ProfessionDetails customerProfession;
	

	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankDetails;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private LoanDetails customerLoanDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyDetails customerPropertyInfo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails guarantorDetails;
	

	@OneToOne(cascade = CascadeType.ALL)
	private CustomerMortgageDetails customerMortgageDetails;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private SanctionLetter customerSanctionLetter;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LoanDisbursement customerLoanDisbursment;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Cibil cibil;



	@OneToOne(cascade = CascadeType.ALL)
	private Ledger customerLedger;
	


	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails customerBankDetails;
	
	

}
