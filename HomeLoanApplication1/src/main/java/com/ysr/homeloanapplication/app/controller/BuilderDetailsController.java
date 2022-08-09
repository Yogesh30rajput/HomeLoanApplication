package com.ysr.homeloanapplication.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ysr.homeloanapplication.app.model.BuilderDetails;
import com.ysr.homeloanapplication.app.serviceInterface.BuilderDetailsI;

@CrossOrigin("*")
@RestController
public class BuilderDetailsController {
	
	@Autowired
	BuilderDetailsI builderDetailsI;
	
	@PostMapping("/saveBuilderDetails")
	public String saveBuilderDetails (@RequestBody BuilderDetails bd) {
		
	BuilderDetails bdetails	= builderDetailsI.saveBuilderDetails(bd);
	
	return "successfully saved";
	}
	
	@GetMapping("/getBuilderDetails")
	public List<BuilderDetails> getBuilderDetails() {
		
		List<BuilderDetails> blist = builderDetailsI.getBuilderDetails();
		
		return blist;
	}

}
