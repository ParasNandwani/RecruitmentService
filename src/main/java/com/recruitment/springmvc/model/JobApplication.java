package com.recruitment.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames="email"))
public class JobApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long applicationId;
	private Long jobOfferId;
	private String email; 
	private String resumeText;
	private int applicationStatus;
	
	public JobApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobApplication(Long applicationId, Long jobOfferId, String email, String resumeText, int applicationStatus) {
		super();
		this.applicationId = applicationId;
		this.jobOfferId = jobOfferId;
		this.email = email;
		this.resumeText = resumeText;
		this.applicationStatus = applicationStatus;
	}
	public Long getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}
	public Long getJobOfferId() {
		return jobOfferId;
	}
	public void setJobOfferId(Long jobOfferId) {
		this.jobOfferId = jobOfferId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getResumeText() {
		return resumeText;
	}
	public void setResumeText(String resumeText) {
		this.resumeText = resumeText;
	}
	public int getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(int applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	@Override
	public String toString() {
		return "JobApplication [applicationId=" + applicationId + ", jobOfferId=" + jobOfferId + ", email=" + email
				+ ", resumeText=" + resumeText + ", applicationStatus=" + applicationStatus + "]";
	}
	
}
