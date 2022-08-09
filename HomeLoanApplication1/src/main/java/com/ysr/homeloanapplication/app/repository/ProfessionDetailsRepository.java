package com.ysr.homeloanapplication.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ysr.homeloanapplication.app.model.ProfessionDetails;

@Repository
public interface ProfessionDetailsRepository extends JpaRepository<ProfessionDetails, Integer>{

}
