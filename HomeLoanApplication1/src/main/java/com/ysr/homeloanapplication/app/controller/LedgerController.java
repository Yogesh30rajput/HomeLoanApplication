package com.ysr.homeloanapplication.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ysr.homeloanapplication.app.model.Ledger;
import com.ysr.homeloanapplication.app.serviceInterface.LedgerI;

@CrossOrigin("*")
@RestController
public class LedgerController {
	
	@Autowired
	LedgerI ledgeri;
	
	@PostMapping("/saveLedger")
	public String saveLedger(@RequestBody Ledger l) {
		
		 ledgeri.saveLedger(l);
		 
		 return "Successfully Saved";
	}
	
	@GetMapping("/getLedger")
	public List<Ledger> getLedger(){
		
		List<Ledger> ledgerlist= ledgeri.getLedger();
		
		return ledgerlist;
	}

}
