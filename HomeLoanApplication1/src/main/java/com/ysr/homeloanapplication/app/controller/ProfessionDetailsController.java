package com.ysr.homeloanapplication.app.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ysr.homeloanapplication.app.model.ProfessionDetails;
import com.ysr.homeloanapplication.app.serviceInterface.ProfessionDetailsI;

@CrossOrigin("*")
@RestController
public class ProfessionDetailsController {
	
	@Autowired
	ProfessionDetailsI pdi;
	

	@PostMapping(value="/saveProfessionDetails" ,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String saveProfessionDetails(@RequestPart ("professionSalarySlip") MultipartFile file, @RequestPart ("cust") String cust) throws JsonMappingException, JsonProcessingException
	
	{
		ObjectMapper om=new ObjectMapper();
		
		ProfessionDetails ProDetails = om.readValue(cust, ProfessionDetails.class);
		
		try {
			System.out.println(ProDetails);
			ProDetails.setProfessionSalarySlip(file.getBytes());

			 pdi.saveProfessionDetails(ProDetails);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return "successfully Saved";
		}
	
	@GetMapping(value="/getProfessionDetails")
	public List<ProfessionDetails> getProfessionDetails()
	{
		List<ProfessionDetails> prdetails = pdi.getProfessionDetails();
		return prdetails;
	}
	
}
