package com.ysr.homeloanapplication.app.serviceInterface;

import java.util.List;

import com.ysr.homeloanapplication.app.model.BuilderDetails;

public interface BuilderDetailsI {

	BuilderDetails saveBuilderDetails(BuilderDetails bd);

	List<BuilderDetails> getBuilderDetails();

}
