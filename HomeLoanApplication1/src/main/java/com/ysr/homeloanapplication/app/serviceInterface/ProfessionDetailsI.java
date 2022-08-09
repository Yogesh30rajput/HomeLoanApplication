package com.ysr.homeloanapplication.app.serviceInterface;

import java.util.List;

import com.ysr.homeloanapplication.app.model.ProfessionDetails;

public interface ProfessionDetailsI {

	
	List<ProfessionDetails> getProfessionDetails();

	void saveProfessionDetails(ProfessionDetails proDetails);

	
	

}
