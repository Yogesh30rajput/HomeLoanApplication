package com.ysr.homeloanapplication.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysr.homeloanapplication.app.model.Ledger;
import com.ysr.homeloanapplication.app.repository.LedgerRepository;
import com.ysr.homeloanapplication.app.serviceInterface.LedgerI;

@Service
public class LedgerIMPL implements LedgerI{
	
	@Autowired
	LedgerRepository ledgerRepository;

	@Override
	public void saveLedger(Ledger l) {
		
		ledgerRepository.save(l);
		
	}

	@Override
	public List<Ledger> getLedger() {
		
		List<Ledger> ledgerList=ledgerRepository.findAll();
		return ledgerList;
	}
	
	

}
