package com.ysr.homeloanapplication.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ysr.homeloanapplication.app.model.EnquiryDetails;

public interface EnquiryRepository extends JpaRepository<EnquiryDetails, Integer>{

}
