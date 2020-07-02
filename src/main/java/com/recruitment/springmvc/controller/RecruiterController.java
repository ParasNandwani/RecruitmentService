package com.recruitment.springmvc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recruitment.springmvc.model.JobApplication;
import com.recruitment.springmvc.model.JobOffer;
import com.recruitment.springmvc.service.JobOfferService;
import com.recruitment.springmvc.utils.CustomException;

@RestController
@RequestMapping("/recruiter")
public class RecruiterController {

	
	@Autowired
	JobOfferService JobOfferSrvice;
	
	//Create a job offer
	@PostMapping(value = "/postJob",produces ="application/json" )
	public ResponseEntity<?> createJobOffer(@RequestBody JobOffer jobOffer){
		try {
			JobOfferSrvice.createJobService(jobOffer);
		}catch (DataIntegrityViolationException e) {
			throw new CustomException("Job Title should be unique", "500");
		}
		return ResponseEntity.ok().build();
	}
	
	//Get All Job Offers
	@GetMapping(value = "/getJobs",produces ="application/json" )
	public ResponseEntity<java.util.List<JobOffer>> getAllJobOfferings(){
		List<JobOffer> jobOffers=JobOfferSrvice.getAllJobs();
		return ResponseEntity.ok(jobOffers);
	}
	
	//Get All Job Offers
	@GetMapping(value = "/getApplicants/{jobId}",produces ="application/json" )
	public ResponseEntity<?> getAllApplicantsByJob(@PathVariable Long jobId){
		List<JobApplication> jobOffers=JobOfferSrvice.getAllApplicantsByJobid(jobId);
		return ResponseEntity.ok(jobOffers);
	}
	
	
	@GetMapping("/hello")
	public String hello() {
		return "hello testing";
	}
}
