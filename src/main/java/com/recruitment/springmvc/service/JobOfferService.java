package com.recruitment.springmvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.recruitment.springmvc.model.JobApplication;
import com.recruitment.springmvc.model.JobOffer;

public interface JobOfferService {
	public void createJobService(JobOffer jobOffer);
	public List<JobOffer> getAllJobs();
	public List<JobApplication> getAllApplicantsByJobid(Long jobId);
}
