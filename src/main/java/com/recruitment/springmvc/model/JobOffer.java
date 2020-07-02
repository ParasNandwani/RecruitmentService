package com.recruitment.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames="jobTitle"))
public class JobOffer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long jobOfferId;
	private String jobTitle;
	private String starttDate;
	private long noOfApplications;
	
	public JobOffer() {
		super();
	}

	public JobOffer( String jobTitle, String starttDate, long noOfApplications) {
		super();
		this.jobTitle = jobTitle;
		this.starttDate = starttDate;
		this.noOfApplications = noOfApplications;
	}

	public long getJobOfferId() {
		return jobOfferId;
	}

	public void setJobOfferId(long jobOfferId) {
		this.jobOfferId = jobOfferId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getStarttDate() {
		return starttDate;
	}

	public void setStarttDate(String starttDate) {
		this.starttDate = starttDate;
	}

	public long getNoOfApplications() {
		return noOfApplications;
	}

	public void setNoOfApplications(long noOfApplications) {
		this.noOfApplications = noOfApplications;
	}

	@Override
	public String toString() {
		return "JobOffer [jobOfferId=" + jobOfferId + ", jobTitle=" + jobTitle + ", starttDate=" + starttDate
				+ ", noOfApplications=" + noOfApplications + "]";
	}
}
