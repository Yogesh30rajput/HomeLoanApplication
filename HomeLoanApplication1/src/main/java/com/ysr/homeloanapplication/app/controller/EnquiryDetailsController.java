package com.ysr.homeloanapplication.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ysr.homeloanapplication.app.model.EnquiryDetails;
import com.ysr.homeloanapplication.app.serviceInterface.ServiceI;

@RestController
public class EnquiryDetailsController {
	
	@Autowired
	ServiceI si;
	
	@PostMapping("/enquiryDetail")
	public EnquiryDetails saveEnquiryDetails (@RequestBody EnquiryDetails ed)
	{
		EnquiryDetails edt =si.saveEnquiryDetails(ed);
		return edt;
	}
	
	@GetMapping("/enquiryDetails")
	public List<EnquiryDetails> getEnquiryDetails()
	{
		List<EnquiryDetails> edt =si.getEnquiryDetails();
		return edt;
	}


}
