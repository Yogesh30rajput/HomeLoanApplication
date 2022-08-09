package com.ysr.homeloanapplication.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysr.homeloanapplication.app.model.BuilderDetails;
import com.ysr.homeloanapplication.app.repository.BuilderDetailsRepository;
import com.ysr.homeloanapplication.app.serviceInterface.BuilderDetailsI;

@Service
public class BuilderDetailsIMPL implements BuilderDetailsI{
	
	@Autowired
	BuilderDetailsRepository builderDetailsRepository;

	@Override
	public BuilderDetails saveBuilderDetails(BuilderDetails bd) {
		
		
		return builderDetailsRepository.save(bd);
	}

	@Override
	public List<BuilderDetails> getBuilderDetails() {
		
		
		return builderDetailsRepository.findAll();
	}

}
