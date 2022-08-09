package com.ysr.homeloanapplication.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;


import com.ysr.homeloanapplication.app.model.PropertyDetails;
import com.ysr.homeloanapplication.app.serviceInterface.PropertyDetailsI;

@CrossOrigin("*")
@RestController
public class PropertyDetailsController {
	
	@Autowired
	PropertyDetailsI pdi;
	
	@PostMapping(value="/savePropertyDetails")
	public PropertyDetails savePropertyDetails(@RequestPart PropertyDetails pd )
	
	{
		PropertyDetails saveDetails =pdi.savePropertyDetails(pd);
		
		return saveDetails;
		}
	
	
	@GetMapping(value="/getpropertyDetails")
	public List<PropertyDetails> getPropertyDetails()
	{
		List<PropertyDetails> getdetails = pdi.getPropertyDetails();
		return getdetails;
	}
	
	@PutMapping(value = "/propertyDetails/{propertyId}")
	public PropertyDetails updatePropertyDetails(@PathVariable Integer propertyId, @RequestBody PropertyDetails pd)
	{
		PropertyDetails updatedetails =pdi.updatePropertyDetails(propertyId,pd);
		return updatedetails;
	}

}
