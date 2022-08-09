package com.ysr.homeloanapplication.app.serviceInterface;

import java.util.List;

import com.ysr.homeloanapplication.app.model.PropertyDetails;

public interface PropertyDetailsI {

	PropertyDetails savePropertyDetails(PropertyDetails pd);

	List<PropertyDetails> getPropertyDetails();

	PropertyDetails updatePropertyDetails(Integer propertyId, PropertyDetails pd);

}
