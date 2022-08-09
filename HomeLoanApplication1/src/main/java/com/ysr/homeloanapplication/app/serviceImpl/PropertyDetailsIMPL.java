package com.ysr.homeloanapplication.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysr.homeloanapplication.app.model.PropertyDetails;
import com.ysr.homeloanapplication.app.repository.PropertyDetailsRepository;
import com.ysr.homeloanapplication.app.serviceInterface.PropertyDetailsI;

@Service
public class PropertyDetailsIMPL implements PropertyDetailsI{
	
	@Autowired
	PropertyDetailsRepository pdr;

	@Override
	public PropertyDetails savePropertyDetails(PropertyDetails pd) {
		
		PropertyDetails pdt = pdr.save(pd);
		return pdt;
	}

	@Override
	public List<PropertyDetails> getPropertyDetails() {
		
		
		return pdr.findAll();
	}

	@Override
	public PropertyDetails updatePropertyDetails(Integer propertyId, PropertyDetails pd) {

			Optional<PropertyDetails> op=pdr.findById(propertyId);
			
			if(op.isPresent()) {
				
				PropertyDetails property=op.get();
				property.setPropertyName(pd.getPropertyName());
				property.setPropertyAddress(pd.getPropertyAddress());
				property.setPropertyAgreementAmount(pd.getPropertyAgreementAmount());
				property.setPropertyStatus(pd.getPropertyStatus());
				
				//BuilderDetails is Secondary Reference of PropertyDetails
				property.setBuilderDetails(pd.getBuilderDetails());
				
				return pdr.save(property);
			}
			
		return null;
	}

}
