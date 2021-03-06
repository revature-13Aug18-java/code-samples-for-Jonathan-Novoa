package com.revature.salutem.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Submission {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="submissionSequence")
	@SequenceGenerator(name="submissionSequence",allocationSize=1,sequenceName="SQ_SUB_PK")
	@Column(name="SUBMISSION_ID")
	private int id;
	
	@Column(name="ACC_ID")
	private int accountId;
	
	@Column(name="SYMPTOM_ID")
	private int symptomId;
	
	@Column(name="SUBMISSION_DATE")
	private Date submissionDate;

	public Submission() {
		super();
	}

	public Submission(int id, int accountId, int symptomId, Date submissionDate) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.symptomId = symptomId;
		this.submissionDate = submissionDate;
	}

	public Submission(int accountId, int symptomId, Date submissionDate) {
		super();
		this.id = 0;
		this.accountId = accountId;
		this.symptomId = symptomId;
		this.submissionDate = submissionDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getSymptomId() {
		return symptomId;
	}

	public void setSymptomId(int symptomId) {
		this.symptomId = symptomId;
	}

	public Date getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountId;
		result = prime * result + id;
		result = prime * result + ((submissionDate == null) ? 0 : submissionDate.hashCode());
		result = prime * result + symptomId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Submission other = (Submission) obj;
		if (accountId != other.accountId)
			return false;
		if (id != other.id)
			return false;
		if (submissionDate == null) {
			if (other.submissionDate != null)
				return false;
		} else if (!submissionDate.equals(other.submissionDate))
			return false;
		if (symptomId != other.symptomId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Submission [id=" + id + ", accountId=" + accountId + ", symptomId=" + symptomId + ", submissionDate="
				+ submissionDate + "]";
	}
	
	
}
