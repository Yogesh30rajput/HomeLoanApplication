package com.ysr.homeloanapplication.app.serviceInterface;

import java.util.List;

import com.ysr.homeloanapplication.app.model.EnquiryDetails;

public interface ServiceI {

	EnquiryDetails saveEnquiryDetails(EnquiryDetails ed);

	List<EnquiryDetails> getEnquiryDetails();

	

	

	

}
