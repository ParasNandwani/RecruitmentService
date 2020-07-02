package com.recruitment.springmvc;


import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.recruitment.springmvc.controller.RecruiterController;
import com.recruitment.springmvc.model.JobOffer;
import com.recruitment.springmvc.service.JobOfferService;


@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class RepositoryTestCase {

	@Autowired
	RecruiterController recruiterController;
	
	@MockBean
	JobOfferService offerService;
	
	
	@Test
	public void createJobOffer() {
		when(offerService.createJobService(new JobOffer(jobOfferId, jobTitle, starttDate, noOfApplications));)
	}
	
	
	
	
}
