package com.ysr.homeloanapplication.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ysr.homeloanapplication.app.model.LoanDetails;
import com.ysr.homeloanapplication.app.serviceInterface.LoanDetailsI;

@CrossOrigin("*")
@RestController
public class LoanDetailsController {
	
	@Autowired
	LoanDetailsI loanDetailsi;
	
	@PostMapping("/saveLoanDetails")
	public String saveLoanDetails (@RequestBody LoanDetails ld) {
		
		loanDetailsi.saveLoanDetails(ld);
		
		return "Successfully Saved";
	}
	
	@GetMapping("/getLoanDetails")
	public List<LoanDetails> getLoanDetails(){
		
		List<LoanDetails> loanlist=loanDetailsi.getLoanDetails();
		
		return loanlist;
	}

}
