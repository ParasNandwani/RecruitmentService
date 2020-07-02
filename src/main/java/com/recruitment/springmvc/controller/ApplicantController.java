package com.recruitment.springmvc.controller;

import org.hibernate.engine.transaction.jta.platform.internal.JOnASJtaPlatform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.recruitment.springmvc.model.JobApplication;
import com.recruitment.springmvc.service.JobApplicationService;
import com.recruitment.springmvc.utils.CustomException;

@RestController
public class ApplicantController {
	
	
	@Autowired
	JobApplicationService jobApplicationService;
	
	
	@PostMapping(value = "/apply",produces="application/json")
	public ResponseEntity<?> applyForJob(@RequestBody JobApplication jobApplication ){
		try {
		  jobApplicationService.postJobApplication(jobApplication);
		}catch (DataIntegrityViolationException e) {
			throw new CustomException("email id should be unique", "500");
		}
		return ResponseEntity.ok().build();
	}
	
	
}
