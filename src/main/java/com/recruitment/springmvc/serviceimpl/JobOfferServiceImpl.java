package com.recruitment.springmvc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recruitment.springmvc.dao.JobApplicantDao;
import com.recruitment.springmvc.dao.JobOfferDao;
import com.recruitment.springmvc.model.JobApplication;
import com.recruitment.springmvc.model.JobOffer;
import com.recruitment.springmvc.service.JobOfferService;


@Service
public class JobOfferServiceImpl implements JobOfferService{

	@Autowired
	JobOfferDao jobOfferDao;
	
	@Autowired
	JobApplicantDao jobApplicantDao;

	@Override
	public void createJobService(JobOffer jobOffer) {
		 jobOfferDao.save(jobOffer);
	}

	@Override
	public List<JobOffer> getAllJobs() {
		return jobOfferDao.findAll();
	}

	@Override
	public List<JobApplication> getAllApplicantsByJobid(Long jobId) {
		return jobApplicantDao.findByJobOfferId(jobId);
	}
	
}
