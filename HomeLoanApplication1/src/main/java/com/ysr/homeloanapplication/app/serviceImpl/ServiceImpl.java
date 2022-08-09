package com.ysr.homeloanapplication.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysr.homeloanapplication.app.model.EnquiryDetails;
import com.ysr.homeloanapplication.app.repository.EnquiryRepository;
import com.ysr.homeloanapplication.app.serviceInterface.ServiceI;

@Service
public class ServiceImpl implements ServiceI {
	
	@Autowired
	EnquiryRepository er;

	@Override
	public EnquiryDetails saveEnquiryDetails(EnquiryDetails ed) {
		
	EnquiryDetails edt=	er.save(ed);
		return  edt;
	}

	@Override
	public List<EnquiryDetails> getEnquiryDetails() {
		
		List<EnquiryDetails>edt	=er.findAll();
		
		return edt;
	}

	

	

}
