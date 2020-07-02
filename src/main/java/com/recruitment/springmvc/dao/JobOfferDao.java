package com.recruitment.springmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.recruitment.springmvc.model.JobOffer;


@Repository
public interface JobOfferDao extends JpaRepository<JobOffer,Long>{
}
