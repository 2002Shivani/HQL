package com.population;

import jakarta.annotation.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Population_Control_Service")
public class PopulationCusesDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uniqueId;
	private String peopleName;
	@Column(name="Date of Birth")
	private String dob;
	@Column(name="City")
	private String palce;
	private String State;
	private String surveyDate;
	private long mobileNumber;
	private String occupation;
	
	
	public PopulationCusesDetails() {
	
	}
	public PopulationCusesDetails(int uniqueId, String peopleName, String dob, String palce, String state,
			String surveyDate, long mobileNumber, String occupation) {
		super();
		this.uniqueId = uniqueId;
		this.peopleName = peopleName;
		this.dob = dob;
		this.palce = palce;
		State = state;
		this.surveyDate = surveyDate;
		this.mobileNumber = mobileNumber;
		this.occupation = occupation;
	}
	public int getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getPeopleName() {
		return peopleName;
	}
	public void setPeopleName(String peopleName) {
		this.peopleName = peopleName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPalce() {
		return palce;
	}
	public void setPalce(String palce) {
		this.palce = palce;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getSurveyDate() {
		return surveyDate;
	}
	public void setSurveyDate(String surveyDate) {
		this.surveyDate = surveyDate;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	@Override
	public String toString() {
		return "PopulationCusesDetails [uniqueId=" + uniqueId + ", peopleName=" + peopleName + ", dob=" + dob
				+ ", palce=" + palce + ", State=" + State + ", surveyDate=" + surveyDate + ", mobileNumber="
				+ mobileNumber + ", occupation=" + occupation + "]";
	}
	
	

	
	
}
