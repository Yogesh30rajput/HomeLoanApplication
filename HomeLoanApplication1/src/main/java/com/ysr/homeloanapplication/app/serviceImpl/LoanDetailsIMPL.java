package com.ysr.homeloanapplication.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysr.homeloanapplication.app.model.LoanDetails;
import com.ysr.homeloanapplication.app.repository.LoanDetailsRepositroy;
import com.ysr.homeloanapplication.app.serviceInterface.LoanDetailsI;

@Service
public class LoanDetailsIMPL implements LoanDetailsI{
	
	@Autowired
	LoanDetailsRepositroy loanDetailsRepository;

	@Override
	public void saveLoanDetails(LoanDetails ld) {
		
		loanDetailsRepository.save(ld);
		
	}

	@Override
	public List<LoanDetails> getLoanDetails() {
		
		List<LoanDetails> loanlist= loanDetailsRepository.findAll();
		
		return loanlist;
	}
	
	

}
