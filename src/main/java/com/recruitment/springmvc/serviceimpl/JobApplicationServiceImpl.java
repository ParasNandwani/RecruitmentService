package com.recruitment.springmvc.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recruitment.springmvc.dao.JobApplicantDao;
import com.recruitment.springmvc.dao.JobOfferDao;
import com.recruitment.springmvc.model.JobApplication;
import com.recruitment.springmvc.model.JobOffer;
import com.recruitment.springmvc.service.JobApplicationService;

@Service
public class JobApplicationServiceImpl implements JobApplicationService {
	
	@Autowired
	JobApplicantDao jobApplicationDao;
	
	@Autowired
	JobOfferDao jobOfferDao;

	@Override
	public void postJobApplication(JobApplication application) {
		jobApplicationDao.save(application);
		Long jobId=application.getJobOfferId();
		Optional<JobOffer> job=jobOfferDao.findById(jobId);
		if(job.isPresent()) {
			JobOffer jobOffer=job.get();
			jobOffer.setNoOfApplications(jobOffer.getNoOfApplications()+1);
			jobOfferDao.save(jobOffer);
		}
	}
}
