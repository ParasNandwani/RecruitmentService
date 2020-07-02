package com.recruitment.springmvc.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recruitment.springmvc.model.JobApplication;

@Repository
public interface JobApplicantDao extends JpaRepository<JobApplication,Long> {
	
	List<JobApplication> findByJobOfferId(Long jobId);
}
