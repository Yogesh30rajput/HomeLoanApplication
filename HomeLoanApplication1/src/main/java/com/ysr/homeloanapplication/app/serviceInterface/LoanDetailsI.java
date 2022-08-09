package com.ysr.homeloanapplication.app.serviceInterface;

import java.util.List;

import com.ysr.homeloanapplication.app.model.LoanDetails;

public interface LoanDetailsI {

	void saveLoanDetails(LoanDetails ld);

	List<LoanDetails> getLoanDetails();

}
