package com.ysr.homeloanapplication.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysr.homeloanapplication.app.model.ProfessionDetails;
import com.ysr.homeloanapplication.app.repository.ProfessionDetailsRepository;
import com.ysr.homeloanapplication.app.serviceInterface.ProfessionDetailsI;

@Service
public class ProfessionDetailsIMPL implements ProfessionDetailsI {
	
	@Autowired
	ProfessionDetailsRepository pdr;

	@Override
	public void saveProfessionDetails(ProfessionDetails proDetails) {
		
		pdr.save(proDetails);
		
	}

	@Override
	public List<ProfessionDetails> getProfessionDetails() {
		
		
		return pdr.findAll();
	}

}
